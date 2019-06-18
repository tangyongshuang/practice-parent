//package com.anhe.test;
//
//import io.prometheus.client.exporter.MetricsServlet;
//import io.prometheus.client.hotspot.DefaultExports;
//import io.prometheus.client.spring.boot.SpringBootMetricsCollector;
//import org.springframework.boot.actuate.endpoint.PublicMetrics;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Collection;
//
//@Configuration
//public class MetricsConfiguration {
//
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        DefaultExports.initialize();
//        // To expose the metrics used in your code, you would add the Prometheus servlet to your Tomcat server:
//        // 添加Servlet，暴露度量指标
//        return new ServletRegistrationBean(new MetricsServlet(), "/prometheus");
//    }
//
////    @Bean
////    public SpringBootMetricsCollector springBootMetricsCollector(Collection<PublicMetrics> publicMetrics) {
////        SpringBootMetricsCollector springBootMetricsCollector = new SpringBootMetricsCollector(publicMetrics);
////        springBootMetricsCollector.register();
////        return springBootMetricsCollector;
////    }
//}