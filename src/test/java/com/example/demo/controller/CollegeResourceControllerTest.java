
package com.example.demo.controller;

import com.example.demo.model.CollegeResource;
import com.example.demo.service.CollegeResourceService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CollegeResourceControllerTest {

    @InjectMocks
    private CollegeResourceController collegeResourceController;

    @Mock
    private CollegeResourceService collegeResourceService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllCollegeResources() {
        CollegeResource resource = new CollegeResource();
        resource.setId("1");
        resource.setName("Test Resource");

        List<CollegeResource> expectedResources = Collections.singletonList(resource);

        when(collegeResourceService.getAllCollegeResources()).thenReturn(expectedResources);

        List<CollegeResource> response = collegeResourceController.getAllCollegeResources();

        assertEquals(expectedResources, response);
    }
}
