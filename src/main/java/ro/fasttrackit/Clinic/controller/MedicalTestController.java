package ro.fasttrackit.Clinic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.Clinic.service.MedicalTestService;

@RestController
@RequestMapping("/test")
public class MedicalTestController {
    private MedicalTestService medicalTestService;
}
