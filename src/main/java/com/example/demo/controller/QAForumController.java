package com.example.demo.controller;

import com.example.demo.model.Answer;
import com.example.demo.model.Question;
import com.example.demo.service.QAForumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/qa-forum")
public class QAForumController {

    private final QAForumService qaForumService;

    public QAForumController(QAForumService qaForumService) {
        this.qaForumService = qaForumService;
    }

    @GetMapping("/questions")
    public List<Question> getQuestions(@RequestParam(required = false) String category, @RequestParam(required = false) String searchTerm) {
        return qaForumService.getQuestions(category, searchTerm);
    }

    @GetMapping("/questions/{questionId}/answers")
    public List<Answer> getAnswers(@PathVariable String questionId) {
        return qaForumService.getAnswers(questionId);
    }

    @PostMapping("/questions")
    public Question askQuestion(@RequestBody Question question) {
        return qaForumService.askQuestion(question);
    }
}
