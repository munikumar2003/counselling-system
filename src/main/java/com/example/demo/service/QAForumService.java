package com.example.demo.service;

import com.example.demo.data.QAForumData;
import com.example.demo.model.Answer;
import com.example.demo.model.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QAForumService {

    private final QAForumData qaForumData;

    public QAForumService(QAForumData qaForumData) {
        this.qaForumData = qaForumData;
    }

    public List<Question> getQuestions(String category, String searchTerm) {
        return qaForumData.getQuestions().stream()
                .filter(question -> (category == null || category.equals("all") || question.getCategory().equalsIgnoreCase(category)))
                .filter(question -> (searchTerm == null || question.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) ||
                        question.getContent().toLowerCase().contains(searchTerm.toLowerCase()) ||
                        question.getTags().stream().anyMatch(tag -> tag.toLowerCase().contains(searchTerm.toLowerCase()))))
                .collect(Collectors.toList());
    }

    public List<Answer> getAnswers(String questionId) {
        return qaForumData.getAnswers().stream()
                .filter(answer -> answer.getQuestion_id().equals(questionId))
                .collect(Collectors.toList());
    }

    public Question askQuestion(Question question) {
        // In a real application, you would save the question to a database
        // and generate a unique ID.
        // For this example, we'll just return the question.
        return question;
    }
}
