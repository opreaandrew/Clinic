package ro.fasttrackit.Clinic_Scheduler.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.Clinic_Scheduler.service.VisitService;

@RestController
@RequestMapping("/visit")
public class VisitController {
    private VisitService visitService;
}
