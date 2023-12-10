package ro.fasttrackit.Clinic_Scheduler.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.Clinic_Scheduler.exception.ResourceNotFoundException;
import ro.fasttrackit.Clinic_Scheduler.model.Appointment;
import ro.fasttrackit.Clinic_Scheduler.model.AppointmentStatus;
import ro.fasttrackit.Clinic_Scheduler.model.Doctor;
import ro.fasttrackit.Clinic_Scheduler.model.Patient;
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

    //Get all appointments
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    //Get specific appointment
    public Appointment getSpecificAppointment(Long id) {
        return appointmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment doesn't exist"));
    }

    //New appointment, need validation for overlapping appointments
    public Appointment newAppointment(Appointment appointment) {
        Patient patient = patientRepository.findById(appointment.getPatient().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Patient not found"));
        Doctor doctor = doctorRepository.findById(appointment.getDoctor().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));

        return appointmentRepository.save(appointment);

    }

    //Change status
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
