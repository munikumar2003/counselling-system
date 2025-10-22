package com.example.demo.data;

import com.example.demo.model.SubjectData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Component
public class SubjectWeightageData {

    private Map<String, List<SubjectData>> subjectData;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<Map<String, List<SubjectData>>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/subjectweightage.json");
        try {
            subjectData = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read subject weightage data: " + e.getMessage());
        }
    }

    public Map<String, List<SubjectData>> getSubjectData() {
        return subjectData;
    }
}
