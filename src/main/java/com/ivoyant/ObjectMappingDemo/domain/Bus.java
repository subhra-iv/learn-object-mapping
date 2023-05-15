package com.ivoyant.ObjectMappingDemo.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonTypeName("bus")
public class Bus extends Vehicle{
    private String busName;
    private String busType;
}
