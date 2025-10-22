package com.example.demo.service;

import com.example.demo.data.RankHeatmapData;
import com.example.demo.model.HeatmapData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankHeatmapService {

    private final RankHeatmapData rankHeatmapData;

    public RankHeatmapService(RankHeatmapData rankHeatmapData) {
        this.rankHeatmapData = rankHeatmapData;
    }

    public List<HeatmapData> getHeatmapData(String college, String exam) {
        // In a real application, you would filter the data based on the college and exam.
        // For this example, we'll just return the mock data.
        return rankHeatmapData.getHeatmapData();
    }
}
