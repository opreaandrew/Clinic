package ro.fasttrackit.Clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic.model.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
