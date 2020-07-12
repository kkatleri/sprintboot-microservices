package com.learn.microservices.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Organization {

    String id;
    String name;
    String contactName;
    String contactEmail;
    String contactPhone;

}
