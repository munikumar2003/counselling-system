package com.example.demo.data;

import com.example.demo.model.College;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Component
public class CollegeData {

    private List<College> colleges;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<Map<String, List<College>>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/colleges.json");
        try {
            Map<String, List<College>> collegeMap = mapper.readValue(inputStream, typeReference);
            colleges = collegeMap.get("colleges");
        } catch (IOException e) {
            System.out.println("Unable to read colleges: " + e.getMessage());
        }
    }

    public List<College> getColleges() {
        return colleges;
    }

    public College findCollegeById(String id) {
        return colleges.stream()
                .filter(college -> college.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
