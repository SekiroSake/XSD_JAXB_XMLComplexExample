//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.04 at 10:51:52 AM EDT 
//


package com.test.rss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingEntity_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingEntity_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Entity" type="{urn:oecd:ties:cbc:v1}OrganisationParty_Type"/>
 *         &lt;element name="ReportingRole" type="{urn:oecd:ties:cbc:v1}CbcReportingRole_EnumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingEntity_Type", propOrder = {
    "entity",
    "reportingRole"
})
@XmlSeeAlso({
    CorrectableReportingEntityType.class
})
public class ReportingEntityType {

    @XmlElement(name = "Entity", required = true)
    protected OrganisationPartyType entity;
    @XmlElement(name = "ReportingRole", required = true)
    protected CbcReportingRoleEnumType reportingRole;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationPartyType }
     *     
     */
    public OrganisationPartyType getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationPartyType }
     *     
     */
    public void setEntity(OrganisationPartyType value) {
        this.entity = value;
    }

    /**
     * Gets the value of the reportingRole property.
     * 
     * @return
     *     possible object is
     *     {@link CbcReportingRoleEnumType }
     *     
     */
    public CbcReportingRoleEnumType getReportingRole() {
        return reportingRole;
    }

    /**
     * Sets the value of the reportingRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbcReportingRoleEnumType }
     *     
     */
    public void setReportingRole(CbcReportingRoleEnumType value) {
        this.reportingRole = value;
    }

}
