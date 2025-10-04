package com.example.demo.controller;

import com.example.demo.model.Mentor;
import com.example.demo.model.Session;
import com.example.demo.service.MentorshipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mentorship")
public class MentorshipController {

    private final MentorshipService mentorshipService;

    public MentorshipController(MentorshipService mentorshipService) {
        this.mentorshipService = mentorshipService;
    }

    @GetMapping("/mentors")
    public List<Mentor> getMentors() {
        return mentorshipService.getMentors();
    }

    @GetMapping("/sessions")
    public List<Session> getSessions() {
        return mentorshipService.getSessions();
    }
}
