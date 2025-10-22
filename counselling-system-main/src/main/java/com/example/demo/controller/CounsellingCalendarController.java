package com.example.demo.controller;

import com.example.demo.model.CalendarEvent;
import com.example.demo.service.CounsellingCalendarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/counselling-calendar")
public class CounsellingCalendarController {

    private final CounsellingCalendarService counsellingCalendarService;

    public CounsellingCalendarController(CounsellingCalendarService counsellingCalendarService) {
        this.counsellingCalendarService = counsellingCalendarService;
    }

    @GetMapping
    public List<CalendarEvent> getEvents(@RequestParam(required = false) String exam) {
        if (exam != null && !exam.equalsIgnoreCase("all")) {
            return counsellingCalendarService.getEventsByExam(exam);
        }
        return counsellingCalendarService.getAllEvents();
    }
}
