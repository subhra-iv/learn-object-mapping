package com.ivoyant.ObjectMappingDemo.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonTypeName("car")
public class Car extends Vehicle{
    private String carName;
    private String carType;
}
