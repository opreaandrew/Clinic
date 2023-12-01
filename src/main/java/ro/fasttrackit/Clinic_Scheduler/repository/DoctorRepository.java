package ro.fasttrackit.Clinic_Scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.Clinic_Scheduler.model.Doctor;
import ro.fasttrackit.Clinic_Scheduler.model.Visit;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    interface VisitRepository extends JpaRepository<Visit, Long> {
    }
}
