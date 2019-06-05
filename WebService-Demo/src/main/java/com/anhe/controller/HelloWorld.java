package com.anhe.controller;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Albert.Tang on 2019/4/28 11:02 AM.
 */
@WebService
public class HelloWorld {

    @WebMethod
    public String sayHello(String str) {
        System.out.println("get message...");
        String result = "Hello  World," + str;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Setver is running");
        String address = "http://localhost:9200/HelloWorld";
        HelloWorld implementor = new HelloWorld();
        Endpoint.publish(address,implementor);
    }
}
