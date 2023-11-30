package ro.fasttrackit.Clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic.model.Treatment;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}
