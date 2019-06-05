package com.anhe.test2;

import com.anhe.entity.AdminUser;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Albert.Tang on 2019/5/6 7:52 AM.
 */
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<AdminUser> userClass = AdminUser.class;
        Constructor<AdminUser> constructor = userClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        AdminUser adminUser = constructor.newInstance();
        System.out.println(adminUser);
    }
}
