package ro.fasttrackit.Clinic_Scheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.Clinic_Scheduler.model.ScheduledConsult;
import ro.fasttrackit.Clinic_Scheduler.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping("/{id}/schedule")
    public List<ScheduledConsult> getDoctorSchedule(@PathVariable long id) {
        return doctorService.getDoctorSchedule(id);
    }

    @PostMapping("/{id}/schedule")
    public ScheduledConsult addDoctorSchedule(@PathVariable long id, @RequestBody ScheduledConsult newSchedule) {
        return doctorService.addDoctorSchedule(id, newSchedule);
    }
}
