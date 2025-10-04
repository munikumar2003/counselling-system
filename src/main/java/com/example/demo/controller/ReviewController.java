package com.example.demo.controller;

import com.example.demo.model.Review;
import com.example.demo.service.ReviewService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public List<Review> getReviews(@RequestParam String college) {
        return reviewService.getReviews(college);
    }

    @PostMapping
    public void addReview(@RequestPart("review") Review review, @RequestPart("admission_proof") MultipartFile admissionProof) throws IOException {
        // In a real application, you would save the admission proof to a file system or a cloud storage service.
        System.out.println("Received admission proof: " + admissionProof.getOriginalFilename());
        reviewService.addReview(review);
    }
}
