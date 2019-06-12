package com.anhe.demo;

import org.jolokia.client.J4pClient;
import org.jolokia.client.exception.J4pException;
import org.jolokia.client.request.J4pReadRequest;
import org.jolokia.client.request.J4pReadResponse;

import javax.management.MalformedObjectNameException;
import java.util.Map;

public class JolokiaDemo {
    public static void main(String[] args) throws MalformedObjectNameException, J4pException {
        J4pClient j4pClient = new J4pClient("http://localhost:13567/jolokia");
        J4pReadRequest request = new J4pReadRequest("java.lang:type=Memory", "HeapMemoryUsage");
        J4pReadResponse readResponse = j4pClient.execute(request);
        Map<String, Long> values = readResponse.getValue();
        long used = values.get("used");
        long max = values.get("max");
        int usage = (int) (used * 100L / max);
        System.out.println("Memory usage:used:" + used + "/max:" + max + "=" + usage + "%");
    }
}
