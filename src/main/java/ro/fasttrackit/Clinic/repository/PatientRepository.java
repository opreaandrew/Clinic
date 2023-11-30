package ro.fasttrackit.Clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
