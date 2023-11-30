package ro.fasttrackit.Clinic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.Clinic.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    private DoctorService doctorService;
}
