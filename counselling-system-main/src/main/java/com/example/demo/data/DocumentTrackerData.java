package com.example.demo.data;

import com.example.demo.model.Document;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class DocumentTrackerData {

    private List<Document> documents;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Document>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/documenttracker.json");
        try {
            documents = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read documents: " + e.getMessage());
        }
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
