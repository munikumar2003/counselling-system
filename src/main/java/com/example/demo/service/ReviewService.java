package com.example.demo.service;

import com.example.demo.data.ReviewData;
import com.example.demo.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    private final ReviewData reviewData;

    public ReviewService(ReviewData reviewData) {
        this.reviewData = reviewData;
    }

    public List<Review> getReviews(String college) {
        if (college.equals("all")) {
            return reviewData.getReviews();
        }
        return reviewData.getReviews().stream()
                .filter(review -> review.getCollege().equals(college))
                .collect(Collectors.toList());
    }

    public void addReview(Review review) {
        // In a real application, you would save the review to a database.
        // You would also handle the admission proof file.
        System.out.println("Received review: " + review);
    }
}
