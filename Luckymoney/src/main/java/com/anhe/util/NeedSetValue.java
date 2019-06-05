package com.anhe.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Albert.Tang on 2019/5/15 7:17 AM.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedSetValue {

    Class<?> beanClass();

    String param();

    String method();

    String targetFiled();


}
