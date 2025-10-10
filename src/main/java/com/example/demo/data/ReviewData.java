package com.example.demo.data;

import com.example.demo.model.College;
import com.example.demo.model.Review;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class ReviewData {

    private final CollegeData collegeData;
    private List<Review> reviews;

    public ReviewData(CollegeData collegeData) {
        this.collegeData = collegeData;
    }

    @PostConstruct
    public void init() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Review>> typeReference = new TypeReference<>() {};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/reviews.json");
        try {
            reviews = mapper.readValue(inputStream, typeReference);
            for (Review review : reviews) {
                College college = collegeData.findCollegeById(review.getCollegeId());
                review.setCollege(college);
            }
        } catch (IOException e) {
            System.out.println("Unable to read reviews: " + e.getMessage());
        }
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
