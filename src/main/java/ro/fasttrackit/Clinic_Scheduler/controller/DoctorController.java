package ro.fasttrackit.Clinic_Scheduler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.Clinic_Scheduler.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    private DoctorService doctorService;
}
