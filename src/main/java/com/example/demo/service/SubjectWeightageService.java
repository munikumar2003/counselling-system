package com.example.demo.service;

import com.example.demo.data.SubjectWeightageData;
import com.example.demo.model.SubjectData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectWeightageService {

    private final SubjectWeightageData subjectWeightageData;

    public SubjectWeightageService(SubjectWeightageData subjectWeightageData) {
        this.subjectWeightageData = subjectWeightageData;
    }

    public List<SubjectData> getSubjectData(String exam) {
        return subjectWeightageData.getSubjectData().get(exam);
    }
}
