package com.example.demo.controller;

import com.example.demo.model.SeatData;
import com.example.demo.service.SeatMatrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/seat-matrix")
public class SeatMatrixController {

    private final SeatMatrixService seatMatrixService;

    public SeatMatrixController(SeatMatrixService seatMatrixService) {
        this.seatMatrixService = seatMatrixService;
    }

    @GetMapping
    public List<SeatData> getSeatData(@RequestParam String exam, @RequestParam String state, @RequestParam String type, @RequestParam String searchTerm) {
        return seatMatrixService.getSeatData(exam, state, type, searchTerm);
    }
}
