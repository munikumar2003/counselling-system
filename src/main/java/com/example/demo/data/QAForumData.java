package com.example.demo.data;

import com.example.demo.model.Answer;
import com.example.demo.model.Question;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class QAForumData {
    private List<Question> questions;
    private List<Answer> answers;

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Question>> questionTypeReference = new TypeReference<>() {};
        InputStream questionInputStream = TypeReference.class.getResourceAsStream("/questions.json");
        try {
            questions = mapper.readValue(questionInputStream, questionTypeReference);
        } catch (IOException e) {
            System.out.println("Unable to read questions: " + e.getMessage());
        }

        TypeReference<List<Answer>> answerTypeReference = new TypeReference<>() {};
        InputStream answerInputStream = TypeReference.class.getResourceAsStream("/answers.json");
        try {
            answers = mapper.readValue(answerInputStream, answerTypeReference);
        } catch (IOException e) {
            System.out.println("Unable to read answers: " + e.getMessage());
        }
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
