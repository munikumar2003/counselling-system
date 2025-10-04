package com.example.demo.service;

import com.example.demo.data.MentorshipData;
import com.example.demo.model.Mentor;
import com.example.demo.model.Session;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorshipService {

    private final MentorshipData mentorshipData;

    public MentorshipService(MentorshipData mentorshipData) {
        this.mentorshipData = mentorshipData;
    }

    public List<Mentor> getMentors() {
        return mentorshipData.getMentors();
    }

    public List<Session> getSessions() {
        return mentorshipData.getSessions();
    }
}
