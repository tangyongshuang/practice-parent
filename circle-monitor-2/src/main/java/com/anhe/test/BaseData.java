package com.anhe.test;

import io.prometheus.client.Gauge;

@SuppressWarnings("all")
public class BaseData {

    // Create and register the Collector with the default registry.
    // 使用默认注册表注册Collector
    public static final Gauge HEAP_USED= Gauge.build().labelNames("service","host").name("heapUsed").help("jmx info").register();
    //  Builder的create方法，返回一个Gauge
//    public static final Gauge HEAP_MAX = Gauge.build().create();


}
