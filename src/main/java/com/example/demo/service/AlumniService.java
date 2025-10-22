package com.example.demo.service;

import com.example.demo.data.AlumniData;
import com.example.demo.model.Alumni;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumniService {

    private final AlumniData alumniData;

    public AlumniService(AlumniData alumniData) {
        this.alumniData = alumniData;
    }

    public List<Alumni> getAllAlumni() {
        return alumniData.getAlumni();
    }

    public List<Alumni> getAlumniByCollege(String college) {
        return alumniData.getAlumni().stream()
                .filter(alumni -> alumni.getCollege().equalsIgnoreCase(college))
                .collect(Collectors.toList());
    }
}
