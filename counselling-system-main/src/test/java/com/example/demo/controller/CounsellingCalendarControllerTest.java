
package com.example.demo.controller;

import com.example.demo.model.CalendarEvent;
import com.example.demo.service.CounsellingCalendarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CounsellingCalendarControllerTest {

    @InjectMocks
    private CounsellingCalendarController counsellingCalendarController;

    @Mock
    private CounsellingCalendarService counsellingCalendarService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetEventsAll() {
        CalendarEvent event = new CalendarEvent();
        event.setId("1");
        event.setExam("jee");
        event.setTitle("Registration");

        List<CalendarEvent> expectedEvents = Collections.singletonList(event);

        when(counsellingCalendarService.getAllEvents()).thenReturn(expectedEvents);

        List<CalendarEvent> response = counsellingCalendarController.getEvents("all");

        assertEquals(expectedEvents, response);
    }

    @Test
    public void testGetEventsByExam() {
        CalendarEvent event = new CalendarEvent();
        event.setId("1");
        event.setExam("jee");
        event.setTitle("Registration");

        List<CalendarEvent> expectedEvents = Collections.singletonList(event);

        when(counsellingCalendarService.getEventsByExam("jee")).thenReturn(expectedEvents);

        List<CalendarEvent> response = counsellingCalendarController.getEvents("jee");

        assertEquals(expectedEvents, response);
    }
}
