package ro.fasttrackit.Clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic.model.MedicalTest;

public interface MedicalTestRepository extends JpaRepository<MedicalTest, Long> {
}
