
package com.example.demo.controller;

import com.example.demo.model.Alumni;
import com.example.demo.service.AlumniService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AlumniControllerTest {

    @InjectMocks
    private AlumniController alumniController;

    @Mock
    private AlumniService alumniService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAlumniAll() {
        Alumni alumni = new Alumni();
        alumni.setId("1");
        alumni.setName("Test Alumni");

        List<Alumni> expectedAlumni = Collections.singletonList(alumni);

        when(alumniService.getAllAlumni()).thenReturn(expectedAlumni);

        List<Alumni> response = alumniController.getAlumni("all");

        assertEquals(expectedAlumni, response);
    }

    @Test
    public void testGetAlumniByCollege() {
        Alumni alumni = new Alumni();
        alumni.setId("1");
        alumni.setName("Test Alumni");
        alumni.setCollege("Test College");

        List<Alumni> expectedAlumni = Collections.singletonList(alumni);

        when(alumniService.getAlumniByCollege("Test College")).thenReturn(expectedAlumni);

        List<Alumni> response = alumniController.getAlumni("Test College");

        assertEquals(expectedAlumni, response);
    }
}
