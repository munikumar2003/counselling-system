package com.example.demo.service;

import com.example.demo.data.SeatMatrixData;
import com.example.demo.model.SeatData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatMatrixService {

    private final SeatMatrixData seatMatrixData;

    public SeatMatrixService(SeatMatrixData seatMatrixData) {
        this.seatMatrixData = seatMatrixData;
    }

    public List<SeatData> getSeatData(String exam, String state, String type, String searchTerm) {
        return seatMatrixData.getSeatData().stream()
                .filter(data -> (exam.equals("all") || data.getCollege().toLowerCase().contains(exam.toLowerCase())))
                .filter(data -> (state.equals("all") || data.getLocation().toLowerCase().contains(state.toLowerCase())))
                .filter(data -> (type.equals("all") || data.getType().toLowerCase().equals(type.toLowerCase())))
                .filter(data -> (searchTerm.isEmpty() || data.getCollege().toLowerCase().contains(searchTerm.toLowerCase()) || data.getBranch().toLowerCase().contains(searchTerm.toLowerCase())))
                .collect(Collectors.toList());
    }
}
