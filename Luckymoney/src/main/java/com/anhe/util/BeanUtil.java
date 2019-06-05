package com.anhe.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Albert.Tang on 2019/5/15 7:13 AM.
 */
@Component
public class BeanUtil implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (this.applicationContext == null) {
            this.applicationContext = applicationContext;
        }
    }

    public void setFieldValueForCollection(Collection col) throws Exception {

        //1: 获取到结果集的class对象
        Class<?> clazz = col.iterator().next().getClass();
        //2: 获取到class对象中的属性，定义一个本地缓存
        Field[] fields = clazz.getDeclaredFields();


        Map<String, Object> cache = new HashMap<>();


        //3：遍历我们属性集合中被注解指定到的字段
        for (Field needField : fields) {
            NeedSetValue sv = needField.getAnnotation(NeedSetValue.class);
            if (sv == null) {
                continue;
            }
            needField.setAccessible(true);

            Object bean = this.applicationContext.getBean(sv.beanClass());

            Method method = sv.beanClass().getMethod(sv.method(), clazz.getDeclaredField(sv.param()).getType());

            Field paramField = clazz.getDeclaredField(sv.param());
            paramField.setAccessible(true);

            Field targetFiled = null;
            Boolean needInnerField = !StringUtils.isEmpty(sv.targetFiled());

            String keyPrefix = sv.beanClass() + "-" + sv.method() + "-" + sv.targetFiled() + "-";

            for (Object obj : col) {
                Object paramValue = paramField.get(obj);
                if (paramValue == null) {
                    continue;
                }

                Object value = null;

                //先从缓存中拿
                String key = keyPrefix + paramValue;

                if (cache.containsKey(key)) {
                    value = cache.get(key);
                } else {
                    value = method.invoke(bean, paramValue);

                    if (needInnerField) {
                        if (value != null) {
                            if (targetFiled == null) {
                                targetFiled = value.getClass().getDeclaredField(sv.targetFiled());
                                targetFiled.setAccessible(true);
                            }
                            value = targetFiled.get(value);
                        }
                    }
                    cache.put(key, value);
                }
                needField.set(obj, value);
            }
        }
    }
}