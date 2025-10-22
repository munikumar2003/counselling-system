package com.example.demo.data;

import com.example.demo.model.CalendarEvent;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class CounsellingCalendarData {

    private List<CalendarEvent> events;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<CalendarEvent>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/counsellingcalendar.json");
        try {
            events = mapper.readValue(inputStream, typeReference);
        } catch (IOException e) {
            System.out.println("Unable to read counselling calendar events: " + e.getMessage());
        }
    }

    public List<CalendarEvent> getEvents() {
        return events;
    }
}
