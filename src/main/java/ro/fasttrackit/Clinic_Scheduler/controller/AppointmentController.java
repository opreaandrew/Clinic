package ro.fasttrackit.Clinic_Scheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.Clinic_Scheduler.model.Appointment;
import ro.fasttrackit.Clinic_Scheduler.model.NewAppointment;
import ro.fasttrackit.Clinic_Scheduler.service.AppointmentService;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
@CrossOrigin(value = "http://localhost:4200")

public class AppointmentController {
    private final AppointmentService appointmentService;

    @GetMapping
    // GET all appointments
    List<Appointment> getAllAppointments(){
        return appointmentService.getAllAppointments();
    }

    // GET specific appointment
    @GetMapping("{id}")
    Appointment getAppointment(@PathVariable Long id){
        return appointmentService.getSpecificAppointment(id);
    }

    // POST new appointment
    @PostMapping
    Appointment newAppointment(@RequestBody NewAppointment newAppointment){
        return appointmentService.newAppointment(newAppointment);
    }

    // PATCH existing appointment
    @PatchMapping("/{id}/{status}")
    Appointment statusChange(@PathVariable Long id, @PathVariable String status){
        return appointmentService.changeStatus(id, status);
    }
}
