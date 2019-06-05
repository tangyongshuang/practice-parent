package com.anhe;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/12 9:59 AM.
 */
@XStreamAlias("Person")
public class Person {
    private String name;
    private int age;
    //@XStreamImplicit//只隐藏集合根节点
    @XStreamImplicit(itemFieldName = "friend")//设置重复的节点名，可能会导致无法反序列化
    private List<String> friends;

    public Person(String name, int age, String... friends) {
        this.name = name;
        this.age = age;
        this.friends = Arrays.asList(friends);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", friends=" + friends + "]";
    }
}
