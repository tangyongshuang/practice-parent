package com.anhe.test2;

import com.anhe.pojo.Person;
import com.anhe.pojo.QtdShp;
import com.anhe.util.XmlUtil;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;

/**
 * Created by Albert.Tang on 2019/4/11 11:36 PM.
 */
public class XStreamTest7 {
    public static void main(String[] args) throws IOException {
        XStream xStream = new XStream();
        xStream.processAnnotations(Person.class);
//        Person person1 = new Person("张三", 19, "李四", "王五", "赵六");
//        String s = xStream.toXML(person1);
//        System.out.println(s);
        Person person = (Person) xStream.fromXML("<Person>\n" +
                "  <name>张三</name>\n" +
                "  <age>19</age>\n" +
                "  <friend>李四</friend>\n" +
                "  <friend>王五</friend>\n" +
                "  <friend>赵六</friend>\n" +
                "</Person>");
        System.out.println(111);
    }
}
