package ro.fasttrackit.Clinic_Scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic_Scheduler.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
