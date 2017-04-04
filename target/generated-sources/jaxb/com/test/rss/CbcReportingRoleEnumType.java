//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.04 at 10:51:52 AM EDT 
//


package com.test.rss;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CbcReportingRole_EnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CbcReportingRole_EnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CBC701"/>
 *     &lt;enumeration value="CBC702"/>
 *     &lt;enumeration value="CBC703"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CbcReportingRole_EnumType")
@XmlEnum
public enum CbcReportingRoleEnumType {


    /**
     * Ultimate Parent Entity
     * 
     */
    @XmlEnumValue("CBC701")
    CBC_701("CBC701"),

    /**
     * Surrogate Parent Entity
     * 
     */
    @XmlEnumValue("CBC702")
    CBC_702("CBC702"),

    /**
     * Local Filing
     * 
     */
    @XmlEnumValue("CBC703")
    CBC_703("CBC703");
    private final String value;

    CbcReportingRoleEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CbcReportingRoleEnumType fromValue(String v) {
        for (CbcReportingRoleEnumType c: CbcReportingRoleEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}