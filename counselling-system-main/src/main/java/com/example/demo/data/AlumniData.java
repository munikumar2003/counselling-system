package com.example.demo.data;

import com.example.demo.model.Alumni;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class AlumniData {

    private List<Alumni> alumni;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Alumni>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/alumni.json");
        try {
            alumni = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read alumni: " + e.getMessage());
        }
    }

    public List<Alumni> getAlumni() {
        return alumni;
    }
}
