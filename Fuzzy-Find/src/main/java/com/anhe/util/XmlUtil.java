package com.anhe.util;

import com.thoughtworks.xstream.XStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class XmlUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(XmlUtil.class);

    public static String beanToXml(Object bean) {
        XStream xStream = new XStream();
        xStream.autodetectAnnotations(true);
        return xStream.toXML(bean);
    }

    public static <T> T xmlToBean(String xml, Class<T> clazz) {
        XStream xStream = new XStream();
        xStream.ignoreUnknownElements();
        xStream.processAnnotations(clazz);

        T resultBean = null;
        try {
            resultBean = (T) xStream.fromXML(xml);
        } catch (Exception e) {
            LOGGER.error("xml 转成 bean 失败, xml = {}", xml, e);
        }

        return resultBean;
    }


}


