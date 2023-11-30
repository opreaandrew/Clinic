package ro.fasttrackit.Clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
