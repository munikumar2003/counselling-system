package com.example.demo.service;

import com.example.demo.data.TrendAnalysisData;
import com.example.demo.model.TrendData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendAnalysisService {

    private final TrendAnalysisData trendAnalysisData;

    public TrendAnalysisService(TrendAnalysisData trendAnalysisData) {
        this.trendAnalysisData = trendAnalysisData;
    }

    public List<TrendData> getTrendData(String college, String branch, String category) {
        return trendAnalysisData.getTrendData(college, branch, category);
    }
}
