package com.example.demo.controller;

import com.example.demo.model.Document;
import com.example.demo.service.DocumentTrackerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentTrackerController {

    private final DocumentTrackerService documentTrackerService;

    public DocumentTrackerController(DocumentTrackerService documentTrackerService) {
        this.documentTrackerService = documentTrackerService;
    }

    @GetMapping
    public List<Document> getDocuments(@RequestParam(required = false) String category) {
        if (category != null && !category.equalsIgnoreCase("all")) {
            return documentTrackerService.getDocumentsByCategory(category);
        }
        return documentTrackerService.getAllDocuments();
    }

    @PostMapping("/{id}/upload")
    public void uploadDocument(@PathVariable String id, @RequestParam("file") MultipartFile file) {
        // Handle file upload logic here
    }
}
