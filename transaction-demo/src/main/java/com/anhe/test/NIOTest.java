package com.anhe.test;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/**
 * Created by Albert.Tang on 2019/5/1 11:36 AM.
 */
public class NIOTest {
    public static void main(String[] args) {
        FileSystemProvider defaultProvider = FileSystems.getDefault().provider();
        FileSystem aDefault = FileSystems.getDefault();
        System.out.println(defaultProvider.toString());
        System.out.println(aDefault.toString());

    }
}
