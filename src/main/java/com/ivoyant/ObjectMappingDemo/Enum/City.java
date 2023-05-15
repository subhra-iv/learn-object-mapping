package com.ivoyant.ObjectMappingDemo.Enum;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum City {
    ATLANTA("atlanta"),
    FAIRFIELD("fairfield"),
    @JsonEnumDefaultValue
    UNKNOWN("unknown");
    @JsonValue
    private String value;
}
