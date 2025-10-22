package com.example.demo.controller;

import com.example.demo.model.HeatmapData;
import com.example.demo.service.RankHeatmapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rank-heatmap")
public class RankHeatmapController {

    private final RankHeatmapService rankHeatmapService;

    public RankHeatmapController(RankHeatmapService rankHeatmapService) {
        this.rankHeatmapService = rankHeatmapService;
    }

    @GetMapping
    public List<HeatmapData> getHeatmapData(@RequestParam String college, @RequestParam String exam) {
        return rankHeatmapService.getHeatmapData(college, exam);
    }
}
