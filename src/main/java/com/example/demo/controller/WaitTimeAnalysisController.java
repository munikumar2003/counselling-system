package com.example.demo.controller;

import com.example.demo.model.WaitTimeData;
import com.example.demo.service.WaitTimeAnalysisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/wait-time-analysis")
public class WaitTimeAnalysisController {

    private final WaitTimeAnalysisService waitTimeAnalysisService;

    public WaitTimeAnalysisController(WaitTimeAnalysisService waitTimeAnalysisService) {
        this.waitTimeAnalysisService = waitTimeAnalysisService;
    }

    @GetMapping
    public List<WaitTimeData> getWaitTimeData(@RequestParam String college, @RequestParam String branch, @RequestParam String category, @RequestParam int userRank) {
        return waitTimeAnalysisService.getWaitTimeData(college, branch, category, userRank);
    }
}
