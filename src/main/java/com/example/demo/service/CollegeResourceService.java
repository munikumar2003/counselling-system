package com.example.demo.service;

import com.example.demo.data.CollegeResourceData;
import com.example.demo.model.CollegeResource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeResourceService {

    private final CollegeResourceData collegeResourceData;

    public CollegeResourceService(CollegeResourceData collegeResourceData) {
        this.collegeResourceData = collegeResourceData;
    }

    public List<CollegeResource> getAllCollegeResources() {
        return collegeResourceData.getCollegeResources();
    }
}
