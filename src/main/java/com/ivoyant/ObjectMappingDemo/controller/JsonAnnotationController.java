package com.ivoyant.ObjectMappingDemo.controller;

import com.ivoyant.ObjectMappingDemo.domain.AutoMobile;
import com.ivoyant.ObjectMappingDemo.domain.Student;
import com.ivoyant.ObjectMappingDemo.domain.Vehicle;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("/json")
public class JsonAnnotationController {
    @PostMapping("students")
    public Student saveStudent(@RequestBody Student student){
        student.setResponseCode("{\"code\" : \"200\",\"status\" : \"success\"}");
        student.setResponseTxt("{\"message\" : \"Request successful\"}");
        student.setSchool(null);
        HashMap<String, String> tmpSubjects = new HashMap<>();
        tmpSubjects.put("Sub1", "Java Basic");
        tmpSubjects.put("Sub2", "Spring Boot");
        tmpSubjects.put("Sub3", "Cloud Computing");
        student.setSubjects(tmpSubjects);
        student.setTimestamp(new Date());
        return student;
    }
    @PostMapping("/auto")
    public AutoMobile saveVehicle(@RequestBody AutoMobile autoMobile){
        return autoMobile;
    }
}
