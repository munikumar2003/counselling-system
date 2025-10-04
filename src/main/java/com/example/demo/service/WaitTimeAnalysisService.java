package com.example.demo.service;

import com.example.demo.data.WaitTimeAnalysisData;
import com.example.demo.model.WaitTimeData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaitTimeAnalysisService {

    private final WaitTimeAnalysisData waitTimeAnalysisData;

    public WaitTimeAnalysisService(WaitTimeAnalysisData waitTimeAnalysisData) {
        this.waitTimeAnalysisData = waitTimeAnalysisData;
    }

    public List<WaitTimeData> getWaitTimeData(String college, String branch, String category, int userRank) {
        return waitTimeAnalysisData.getWaitTimeData(college, branch, category, userRank);
    }
}
