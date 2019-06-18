package com.anhe.test;

import io.prometheus.client.Counter;
import io.prometheus.client.Gauge;
import io.prometheus.client.Histogram;

/**
 * 创建度量指标类型，Normal users should use {@link Gauge}, {@link Counter}, {@link Summary} and {@link Histogram}
 * 首先我们要先确定我们的指标是哪一种类型，prom支持4种度量指标类型：Counter（变化的增减量）, Gauge（瞬时值）, Histogram（采样并统计）, Summary（采样结果）
 * 创建度量指标通过使用build的方式，必须标明name和labelNames，name说明是哪一个度量指标，labelNames（标签名）说明这个度量指标是属于哪种类型的，以便我们将来安装应用去监控，
 */
@SuppressWarnings("all")
public class BaseData {

    // Create and register the Collector with the default registry.
    // 使用默认注册表注册Collector
    // 建立度量指标的名称，标签名，help信息,其他的属性是可选的，可以点击源码进行查看
    /**
     * name: the name of the metric. Required.
     * labelNames: the labelNames of the metric. Optional, defaults to no labels.
     * help: the help string of the metric. Required.
     */
    public static final Gauge HEAP_USED = Gauge.build().name("heapUsed").labelNames("service", "host").help("jmx info").register();
    public static final Gauge NO_HEAP_USED = Gauge.build().name("noHeapUsed").labelNames("service", "host").help("jmx info").register();


}
