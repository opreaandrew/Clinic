package ro.fasttrackit.Clinic_Scheduler.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.Clinic_Scheduler.repository.DoctorRepository;

@Service
public class VisitService {
    private DoctorRepository.VisitRepository visitRepository;
}
