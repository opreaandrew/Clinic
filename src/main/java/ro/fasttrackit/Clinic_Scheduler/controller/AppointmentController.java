package ro.fasttrackit.Clinic_Scheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.Clinic_Scheduler.model.Appointment;
import ro.fasttrackit.Clinic_Scheduler.service.AppointmentService;

import java.util.List;

@RestController
@RequestMapping("/appointments")
@RequiredArgsConstructor
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
    @PostMapping("/new/")
    Appointment newAppointment(@RequestBody Appointment appointment){
        return appointmentService.newAppointment(appointment);
    }

    // PATCH existing appointment
    @PatchMapping("/status/{id}/{status}")
    Appointment completedAppointment(@PathVariable Long id, @PathVariable String status){
        return appointmentService.changeStatus(id, status);
    }
}
