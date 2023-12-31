package ro.fasttrackit.Clinic_Scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic_Scheduler.model.Appointment;
import ro.fasttrackit.Clinic_Scheduler.model.Doctor;
import ro.fasttrackit.Clinic_Scheduler.model.Patient;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDoctorAndDate(Doctor doctor, LocalDate newDate);

    List<Appointment> findByPatientAndDate(Patient patient, LocalDate newDate);
}
