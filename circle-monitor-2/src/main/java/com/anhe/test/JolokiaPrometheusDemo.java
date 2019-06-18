package com.anhe.test;

import com.alibaba.fastjson.JSON;
import org.jolokia.client.J4pClient;
import org.jolokia.client.exception.J4pException;
import org.jolokia.client.request.J4pReadRequest;
import org.jolokia.client.request.J4pReadResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import sun.management.snmp.jvminstr.JvmMemoryImpl;

import javax.management.MalformedObjectNameException;
import java.lang.management.MemoryMXBean;
import java.net.URI;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
@Component
public class JolokiaPrometheusDemo implements InitializingBean {

    public static final Logger logger = LoggerFactory.getLogger(JolokiaPrometheusDemo.class);

    @Autowired
    private DiscoveryClient discoveryClient;


    @Override
    public void afterPropertiesSet() throws MalformedObjectNameException, J4pException {
        List<String> serviceIds = discoveryClient.getServices();
        logger.info("all serviceIds : {}", JSON.toJSONString(serviceIds));
        try {
            for (String serviceId : serviceIds) {
                if (!"eureka-server".equals(serviceId) && !"circle-monitor22".equals(serviceId) && !"api-gateway".equals(serviceId)) {
                    List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
                    for (ServiceInstance instance : instances) {
                        URI uri = instance.getUri();
                        logger.info("instance uri :{}", JSON.toJSONString(uri.toString()));
                        setPromethues(uri, serviceId);
                    }
                }
            }
        } catch (Exception e) {
            logger.error("发生异常啦！！异常原因：{}", e.getMessage());
            e.printStackTrace();
        }
    }

    private void setPromethues(URI uri, String serviceId) throws MalformedObjectNameException, J4pException {
        J4pClient j4pClient = new J4pClient(uri.toString() + "/jolokia");
        // 获取String
        J4pReadRequest request = new J4pReadRequest("java.lang:type=Memory", "HeapMemoryUsage");
        J4pReadResponse response = j4pClient.execute(request);
        Map<String, Long> values = response.getValue();
        logger.info("response values : {}", JSON.toJSONString(values));
        Long used = values.get("used");
        BaseData.HEAP_USED.labels(serviceId, uri.getHost()).set(used / 1024 / 1024);
    }


    /**
     * @param args
     * @throws MalformedObjectNameException
     * @throws J4pException
     */
    public static void main(String[] args) throws MalformedObjectNameException, J4pException {

        J4pClient j4pClient = new J4pClient("http://localhost:13567/jolokia");
        J4pReadRequest request = new J4pReadRequest("java.lang:type=Memory", "HeapMemoryUsage");
        J4pReadResponse response = j4pClient.execute(request);
        Map<String, Long> values = response.getValue();
        Long used = values.get("used");

        BaseData.HEAP_USED.labels("demo", "127.0.0.1").set(used / 1024 / 1024);

    }
}
