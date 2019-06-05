
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImageId的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ImageId">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMAGE_1"/>
 *     &lt;enumeration value="IMAGE_2"/>
 *     &lt;enumeration value="IMAGE_3"/>
 *     &lt;enumeration value="IMAGE_4"/>
 *     &lt;enumeration value="IMAGE_5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImageId", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum ImageId {

    IMAGE_1,
    IMAGE_2,
    IMAGE_3,
    IMAGE_4,
    IMAGE_5;

    public String value() {
        return name();
    }

    public static ImageId fromValue(String v) {
        return valueOf(v);
    }

}
