package ro.fasttrackit.Clinic_Scheduler.controller;

import org.apache.coyote.BadRequestException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ro.fasttrackit.Clinic_Scheduler.exception.ResourceNotFoundException;
import ro.fasttrackit.Clinic_Scheduler.model.Patient;
import ro.fasttrackit.Clinic_Scheduler.service.PatientService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PatientControllerTest {
    @Test
    public void test_getAllPatients() {
        // Arrange
        PatientService patientService = mock(PatientService.class);
        List<Patient> expectedPatients = Arrays.asList(new Patient(), new Patient());
        when(patientService.getAllPatients()).thenReturn(expectedPatients);
        PatientController patientController = new PatientController(patientService);

        // Act
        List<Patient> actualPatients = patientController.getAllPatients();

        // Assert
        assertEquals(expectedPatients, actualPatients);
    }

    @Test
    public void test_getSpecificPatient_validId() {
        // Arrange
        PatientService patientService = mock(PatientService.class);
        Long patientId = 1L;
        Patient expectedPatient = new Patient();
        when(patientService.getPatientById(patientId)).thenReturn(expectedPatient);
        PatientController patientController = new PatientController(patientService);

        // Act
        Patient actualPatient = patientController.getSpecificPatient(patientId);

        // Assert
        assertEquals(expectedPatient, actualPatient);
    }

    @Test
    public void test_addPatient() {
        // Arrange
        PatientService patientService = mock(PatientService.class);
        Patient newPatient = new Patient();
        Patient expectedPatient = new Patient();
        when(patientService.newPatient(newPatient)).thenReturn(expectedPatient);
        PatientController patientController = new PatientController(patientService);

        // Act
        Patient actualPatient = patientController.addPatient(newPatient);

        // Assert
        assertEquals(expectedPatient, actualPatient);
    }

    @Test
    public void test_getAllPatients_emptyDatabase() {
        // Arrange
        PatientService patientService = mock(PatientService.class);
        List<Patient> expectedPatients = Collections.emptyList();
        when(patientService.getAllPatients()).thenReturn(expectedPatients);
        PatientController patientController = new PatientController(patientService);

        // Act
        List<Patient> actualPatients = patientController.getAllPatients();

        // Assert
        assertEquals(expectedPatients, actualPatients);
    }

    @Test
    public void test_getSpecificPatient_invalidId() {
        // Arrange
        PatientService patientService = mock(PatientService.class);
        Long invalidId = 999L;
        when(patientService.getPatientById(invalidId)).thenThrow(new ResourceNotFoundException("Could not find Patient with ID: %s".formatted(invalidId)));
        PatientController patientController = new PatientController(patientService);

        // Act and Assert
        assertThrows(ResourceNotFoundException.class, () -> patientController.getSpecificPatient(invalidId));
    }


}