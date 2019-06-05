
package com.anhe.pojo.v23mypackage;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NaftaImporterSpecificationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaImporterSpecificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IMPORTER_OF_RECORD"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="VARIOUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaftaImporterSpecificationType", namespace = "http://fedex.com/ws/ship/v23")
@XmlEnum
public enum NaftaImporterSpecificationType {

    IMPORTER_OF_RECORD,
    RECIPIENT,
    UNKNOWN,
    VARIOUS;

    public String value() {
        return name();
    }

    public static NaftaImporterSpecificationType fromValue(String v) {
        return valueOf(v);
    }

}
