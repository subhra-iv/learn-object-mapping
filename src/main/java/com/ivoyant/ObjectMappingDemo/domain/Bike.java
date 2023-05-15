package com.ivoyant.ObjectMappingDemo.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonTypeName("bike")
public class Bike extends Vehicle{
    private String bikeName;
    private String bikeType;
}
