package ro.fasttrackit.Clinic_Scheduler.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.Clinic_Scheduler.model.Doctor;
import ro.fasttrackit.Clinic_Scheduler.model.ScheduledConsult;
import ro.fasttrackit.Clinic_Scheduler.repository.DoctorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public List<ScheduledConsult> getDoctorSchedule(long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new EntityNotFoundException("Doctor not found"));

        return doctor.getSchedule();
    }

}
