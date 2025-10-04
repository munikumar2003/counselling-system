package com.example.demo.data;

import com.example.demo.model.SeatData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class SeatMatrixData {

    private List<SeatData> seatData;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<SeatData>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/seatmatrix.json");
        try {
            seatData = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read seat matrix data: " + e.getMessage());
        }
    }

    public List<SeatData> getSeatData() {
        return seatData;
    }
}
