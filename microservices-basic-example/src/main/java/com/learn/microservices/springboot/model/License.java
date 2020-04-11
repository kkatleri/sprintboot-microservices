package com.learn.microservices.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Setter @Getter
public class License {

    String id;
    String productName;
    String licenseType;
    String organizationId;

    public License withId(String id){
        this.setId( id );
        return this;
    }

    public License withOrganizationId(String organizationId){
        this.setOrganizationId(organizationId);
        return this;
    }

    public License withProductName(String productName){
        this.setProductName(productName);
        return this;
    }

    public License withLicenseType(String licenseType){
        this.setLicenseType(licenseType);
        return this;
    }

}
