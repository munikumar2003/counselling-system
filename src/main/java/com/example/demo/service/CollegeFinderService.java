package com.example.demo.service;

import com.example.demo.data.CollegeData;
import com.example.demo.model.College;
import com.example.demo.model.CollegeFinderRequest;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CollegeFinderService {

    private final CollegeData collegeData;

    public CollegeFinderService(CollegeData collegeData) {
        this.collegeData = collegeData;
    }

    public List<College> findColleges(CollegeFinderRequest request) {
        List<College> colleges = collegeData.getColleges(request.getExam());
        if (colleges == null) {
            return Collections.emptyList();
        }

        return colleges.stream()
                .filter(college -> request.getSelectedBranches().stream()
                        .anyMatch(branch -> {
                            if (!college.getBranches().contains(branch)) {
                                return false;
                            }
                            Double cutoff = college.getCutoffs().get(branch).get(request.getCategory());
                            if (cutoff == null) {
                                return false;
                            }
                            if ("rank".equals(request.getScoreType())) {
                                return request.getScore() <= cutoff;
                            } else {
                                return request.getScore() >= cutoff;
                            }
                        }))
                .sorted(Comparator.comparing(College::getRating).reversed())
                .collect(Collectors.toList());
    }
}