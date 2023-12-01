package ro.fasttrackit.Clinic_Scheduler.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.Clinic_Scheduler.model.Visit;
import ro.fasttrackit.Clinic_Scheduler.repository.VisitRepository;

import java.util.List;

@Service
public class VisitService {
    private VisitRepository visitRepository;

    //Get all appointments
    public List<Visit> getAllVisits(){
        return visitRepository.findAll();
    }
}
