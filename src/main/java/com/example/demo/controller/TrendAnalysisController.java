package com.example.demo.controller;

import com.example.demo.model.TrendData;
import com.example.demo.service.TrendAnalysisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trend-analysis")
public class TrendAnalysisController {

    private final TrendAnalysisService trendAnalysisService;

    public TrendAnalysisController(TrendAnalysisService trendAnalysisService) {
        this.trendAnalysisService = trendAnalysisService;
    }

    @GetMapping
    public List<TrendData> getTrendData(@RequestParam String college, @RequestParam String branch, @RequestParam String category) {
        return trendAnalysisService.getTrendData(college, branch, category);
    }
}
