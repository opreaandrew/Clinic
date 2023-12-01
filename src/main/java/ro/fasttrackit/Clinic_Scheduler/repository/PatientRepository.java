package ro.fasttrackit.Clinic_Scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic_Scheduler.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
