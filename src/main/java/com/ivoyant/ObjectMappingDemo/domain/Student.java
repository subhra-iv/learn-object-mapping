package com.ivoyant.ObjectMappingDemo.domain;

import com.fasterxml.jackson.annotation.*;
import com.ivoyant.ObjectMappingDemo.Enum.City;
import com.ivoyant.ObjectMappingDemo.Enum.Gender;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

@Setter
@Getter
@JsonIgnoreProperties({"subjects", "colorOfEye"})
@JsonPropertyOrder({"id", "name", "school", "responseCode"})
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class Student implements Serializable {
    private static final long serialVesionUID = -71234567890L;
    @JsonProperty(value = "student_id")
    private String id;
    private String name;
    private String school;
    @JsonIgnore
    private String section;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String major;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonRawValue
    private String responseCode;
    @JsonRawValue
    private String responseTxt;
    private Gender gender;
    private City city;
    private String colorOfEye;
    @JsonSetter("isStudent")
    private boolean isStudent;
    @JsonAnyGetter
    private HashMap<String, String> subjects = new HashMap<>();
    private HashMap<String, String> requestedParams = new HashMap<>();
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy hh:mm:ss")
    private Date timestamp;

    @JsonGetter("isStudent")
    public boolean theStudent() {
        return isStudent;
    }

    @JsonAnySetter
    public void setRequestedParams(String key, String value) {
        this.requestedParams.put(key, value);
    }
}
