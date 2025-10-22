package com.example.demo.data;

import com.example.demo.model.CollegeResource;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class CollegeResourceData {

    private List<CollegeResource> collegeResources;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<CollegeResource>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/collegeresources.json");
        try {
            collegeResources = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read college resources: " + e.getMessage());
        }
    }

    public List<CollegeResource> getCollegeResources() {
        return collegeResources;
    }
}
