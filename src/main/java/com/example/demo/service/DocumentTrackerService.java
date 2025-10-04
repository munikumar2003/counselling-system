package com.example.demo.service;

import com.example.demo.data.DocumentTrackerData;
import com.example.demo.model.Document;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocumentTrackerService {

    private final DocumentTrackerData documentTrackerData;

    public DocumentTrackerService(DocumentTrackerData documentTrackerData) {
        this.documentTrackerData = documentTrackerData;
    }

    public List<Document> getAllDocuments() {
        return documentTrackerData.getDocuments();
    }

    public List<Document> getDocumentsByCategory(String category) {
        return documentTrackerData.getDocuments().stream()
                .filter(document -> document.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}
