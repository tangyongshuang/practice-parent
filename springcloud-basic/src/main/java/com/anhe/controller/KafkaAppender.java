package com.anhe.controller;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.HashMap;
import java.util.Map;

public class KafkaAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {

    private Producer<String, String> producer;
    private String brokerPath;
    private String topics;

    public void setBrokerPath(String brokerPath) {
        this.brokerPath = brokerPath;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    @Override
    protected void append(ILoggingEvent iLoggingEvent) {
        // 分区
        this.producer.send(new ProducerRecord<>(this.topics, 0, "key", iLoggingEvent.getMessage()));
    }

    @Override
    public void start() {
        super.start();
        Map<String, Object> props = new HashMap<>();
        props.put("bootstrap.servers",this.brokerPath);
        props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
        this.producer = new KafkaProducer<String, String>(props);
    }

    @Override
    public void stop() {
        super.stop();
        this.producer.close();
    }
}
