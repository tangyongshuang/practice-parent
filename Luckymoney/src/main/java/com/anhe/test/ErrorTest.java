package com.anhe.test;

import java.io.FileNotFoundException;

/**
 * Created by Albert.Tang on 2019/5/4 11:08 PM.
 */
@SuppressWarnings("all")
public class ErrorTest {
    // jvm负责
    private static void throwError() {
        throw new StackOverflowError();
    }

    // 运行时异常，程序负责
    private static void throwRuntimeException() {
        throw new NullPointerException();
    }

    // 可检查异常，编译器负责，必须处理，负责任的做法是try.catch
    private static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
//        throwError();
        throwRuntimeException();
//        try {
//            throwCheckedException();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException("文件未找到");
//
//        }

        System.out.println(111);
        System.out.println(233);
    }
}
