package com.ivoyant.ObjectMappingDemo.Enum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE("male"),
    FEMALE("female");
    @JsonValue
    private String value;
    @JsonCreator
    public static Gender fromValue(String value){
        for (Gender gender : Gender.values()){
            if (gender.value.equals(value)){
                return gender;
            }
        }
        return null;
    }
}
