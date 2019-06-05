package com.anhe.test;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 将json数据写入文件，同时也会清除文件原本存在的数据
 * Created by Albert.Tang on 2019/5/1 10:42 AM.
 */
@Slf4j
@SuppressWarnings("all")
public class FileWriteTest {
    public static void main(String[] args) {

        List<Bean> beans = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Bean bean = new Bean();
            bean.setB(true);
            bean.setBig(new BigDecimal(1904 + i));
            bean.setS("It's my nio package Files test2");
            beans.add(bean);
        }

        try {
            // 写入文件，写入不支持的文件格式，比如pdf，png，不会抛异常，但是会导致原文件损坏
            Path path = Paths.get("/Users/circleus/Documents/tmp/niofiles.data");
            BufferedWriter writer = Files.newBufferedWriter(path);
            for (Bean bean : beans) {
                writer.write(JSON.toJSONString(bean));
                writer.newLine();
            }
            writer.flush();
            writer.close();

            // 读取文件内容
            BufferedReader reader = Files.newBufferedReader(path);
            ArrayList<Bean> newBeans = new ArrayList<>();
            Stream<String> lines = reader.lines();
            List<String> stringList = lines.collect(Collectors.toList());
            for (String s : stringList) {
                Bean bean = JSON.parseObject(s, Bean.class);
                newBeans.add(bean);
                log.info(JSON.toJSONString(newBeans));
            }
            reader.close();
        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
