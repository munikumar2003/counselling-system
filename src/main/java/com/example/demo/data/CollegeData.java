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

    private Map<String, List<College>> colleges;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<Map<String, List<College>>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/colleges.json");
        try {
            colleges = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read colleges: " + e.getMessage());
        }
    }

    public List<College> getColleges(String exam) {
        return colleges.get(exam);
    }
}
