package com.example.demo.service;

import com.example.demo.data.MultiExamPredictorData;
import com.example.demo.model.College;
import com.example.demo.model.ExamScore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MultiExamPredictorService {

    private final MultiExamPredictorData multiExamPredictorData;

    public MultiExamPredictorService(MultiExamPredictorData multiExamPredictorData) {
        this.multiExamPredictorData = multiExamPredictorData;
    }

    public List<College> predictColleges(List<ExamScore> examScores) {
        List<College> allColleges = multiExamPredictorData.getColleges();
        return allColleges.stream()
                .filter(college -> examScores.stream().anyMatch(examScore -> {
                    if (college.getCutoffs().containsKey(examScore.getExamName())) {
                        if (college.getCutoffs().get(examScore.getExamName()).containsKey(examScore.getCategory())) {
                            double cutoff = college.getCutoffs().get(examScore.getExamName()).get(examScore.getCategory());
                            if (examScore.getExamName().contains("rank") || examScore.getExamName().equals("viteee")) {
                                return examScore.getScore() <= cutoff;
                            } else {
                                return examScore.getScore() >= cutoff;
                            }
                        }
                    }
                    return false;
                }))
                .collect(Collectors.toList());
    }
}
