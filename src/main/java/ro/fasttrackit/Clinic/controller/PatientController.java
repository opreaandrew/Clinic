package ro.fasttrackit.Clinic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.Clinic.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
    private PatientService patientService;
}
