package com.example.demo.service;

import com.example.demo.data.CounsellingCalendarData;
import com.example.demo.model.CalendarEvent;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CounsellingCalendarService {

    private final CounsellingCalendarData counsellingCalendarData;

    public CounsellingCalendarService(CounsellingCalendarData counsellingCalendarData) {
        this.counsellingCalendarData = counsellingCalendarData;
    }

    public List<CalendarEvent> getAllEvents() {
        return counsellingCalendarData.getEvents();
    }

    public List<CalendarEvent> getEventsByExam(String exam) {
        return counsellingCalendarData.getEvents().stream()
                .filter(event -> event.getExam().equalsIgnoreCase(exam))
                .collect(Collectors.toList());
    }
}
