package ro.fasttrackit.Clinic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.fasttrackit.Clinic.service.VisitService;

@RestController
@RequestMapping("/visit")
public class VisitController {
    private VisitService visitService;
}
