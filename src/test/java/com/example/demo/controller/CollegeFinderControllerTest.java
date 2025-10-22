
package com.example.demo.controller;

import com.example.demo.model.College;
import com.example.demo.model.CollegeFinderRequest;
import com.example.demo.model.CollegeFinderResponse;
import com.example.demo.service.CollegeFinderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CollegeFinderControllerTest {

    @InjectMocks
    private CollegeFinderController collegeFinderController;

    @Mock
    private CollegeFinderService collegeFinderService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindColleges() {
        CollegeFinderRequest request = new CollegeFinderRequest();
        request.setExam("jee");
        request.setScore(95.5);
        request.setCategory("general");

        College college = new College();
        college.setId("1");
        college.setName("Test College");

        List<College> expectedColleges = Collections.singletonList(college);

        when(collegeFinderService.findColleges(request)).thenReturn(expectedColleges);

        CollegeFinderResponse response = collegeFinderController.findColleges(request);

        assertEquals(expectedColleges, response.getColleges());
    }
}
