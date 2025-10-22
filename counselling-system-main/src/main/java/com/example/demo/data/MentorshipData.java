package com.example.demo.data;

import com.example.demo.model.Mentor;
import com.example.demo.model.Session;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class MentorshipData {

    private List<Mentor> mentors;
    private List<Session> sessions;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Mentor>> mentorTypeReference = new TypeReference<>() {};
        InputStream mentorInputStream = TypeReference.class.getResourceAsStream("/mentors.json");
        try {
            mentors = mapper.readValue(mentorInputStream, mentorTypeReference);
        } catch (IOException e) {
            System.out.println("Unable to read mentors: " + e.getMessage());
        }

        TypeReference<List<Session>> sessionTypeReference = new TypeReference<>() {};
        InputStream sessionInputStream = TypeReference.class.getResourceAsStream("/sessions.json");
        try {
            sessions = mapper.readValue(sessionInputStream, sessionTypeReference);
        } catch (IOException e) {
            System.out.println("Unable to read sessions: " + e.getMessage());
        }
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public List<Session> getSessions() {
        return sessions;
    }
}
