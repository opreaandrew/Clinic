package ro.fasttrackit.Clinic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.Clinic.service.TreatmentService;

@RestController
@RequestMapping("/treatment")
public class TreatmentController {
    private TreatmentService treatmentService;
}
