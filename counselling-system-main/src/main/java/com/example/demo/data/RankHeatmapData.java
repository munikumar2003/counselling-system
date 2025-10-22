package com.example.demo.data;

import com.example.demo.model.HeatmapData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class RankHeatmapData {
    private List<HeatmapData> heatmapData;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<HeatmapData>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/heatmap.json");
        try {
            heatmapData = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read heatmap data: " + e.getMessage());
        }
    }

    public List<HeatmapData> getHeatmapData() {
        return heatmapData;
    }
}
