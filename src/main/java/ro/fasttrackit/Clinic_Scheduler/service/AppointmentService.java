package ro.fasttrackit.Clinic_Scheduler.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.Clinic_Scheduler.exception.ResourceNotFoundException;
import ro.fasttrackit.Clinic_Scheduler.model.*;
import ro.fasttrackit.Clinic_Scheduler.repository.AppointmentRepository;
import ro.fasttrackit.Clinic_Scheduler.repository.DoctorRepository;
import ro.fasttrackit.Clinic_Scheduler.repository.PatientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment getSpecificAppointment(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment doesn't exist"));
    }

    public Appointment newAppointment(NewAppointment newAppointment) {
        Patient patient = patientRepository.findById(newAppointment.getPatient())
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
        Doctor doctor = doctorRepository.findById(newAppointment.getDoctor())
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
        Appointment appointment = new Appointment()
                .withDate(newAppointment.getDate())
                .withStartTime(newAppointment.getStartTime())
                .withEndTime(newAppointment.getEndTime())
                .withStatus(newAppointment.getStatus())
                .withDoctor(doctor)
                .withPatient(patient);
        return appointmentRepository.save(appointment);

    }

    public Appointment changeStatus(Long id, String status) {
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not found"));

        if (status.equalsIgnoreCase("COMPLETED")) {
            appointment.setStatus(AppointmentStatus.COMPLETED);
        }
        if (status.equalsIgnoreCase("CANCELED")) {
            appointment.setStatus(AppointmentStatus.CANCELED);
        }
        return appointmentRepository.save(appointment);
    }

}
