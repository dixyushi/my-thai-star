/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Jan 12 15:20:23 CET 2018
 */
package com.capgemini.salesforcepoc.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LeadSource
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Lead_LeadSourceEnum {

    // Advertisement
    ADVERTISEMENT("Advertisement"),
    // Employee Referral
    EMPLOYEE_REFERRAL("Employee Referral"),
    // External Referral
    EXTERNAL_REFERRAL("External Referral"),
    // Other
    OTHER("Other"),
    // Partner
    PARTNER("Partner"),
    // Public Relations
    PUBLIC_RELATIONS("Public Relations"),
    // Seminar - Internal
    SEMINAR___INTERNAL("Seminar - Internal"),
    // Seminar - Partner
    SEMINAR___PARTNER("Seminar - Partner"),
    // Trade Show
    TRADE_SHOW("Trade Show"),
    // Web
    WEB("Web"),
    // Word of mouth
    WORD_OF_MOUTH("Word of mouth");

    final String value;

    private Lead_LeadSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Lead_LeadSourceEnum fromValue(String value) {
        for (Lead_LeadSourceEnum e : Lead_LeadSourceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
