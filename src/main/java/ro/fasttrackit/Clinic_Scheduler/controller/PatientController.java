package ro.fasttrackit.Clinic_Scheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.Clinic_Scheduler.model.Patient;
import ro.fasttrackit.Clinic_Scheduler.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    List<Patient> getAllPatients() {
        return null;
    }

    @GetMapping("{id}")
    Patient getSpecificPatient(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @PostMapping
    Patient addPatient(@RequestBody Patient patient) {
        return patientService.newPatient(patient);
    }

    @PatchMapping("{id}")
    Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }
}
