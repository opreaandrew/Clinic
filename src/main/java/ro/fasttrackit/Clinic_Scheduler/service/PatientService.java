package ro.fasttrackit.Clinic_Scheduler.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.Clinic_Scheduler.exception.ResourceNotFoundException;
import ro.fasttrackit.Clinic_Scheduler.model.Patient;
import ro.fasttrackit.Clinic_Scheduler.model.Appointment;
import ro.fasttrackit.Clinic_Scheduler.repository.PatientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    //All patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    //Specific patient
    public Patient getPatientById(Long id) {
        return getOrThrow(id);
    }

    //Register new patient
    public Patient newPatient(Patient newPatient) {
        return patientRepository.save(newPatient);
    }

    // Update patient
    public Patient updatePatient(Long id, Patient patientToUpdate) {
        Patient patient = getOrThrow(id);
        Patient updatedPatient = patient
                .withName(patientToUpdate.getName() == null ? patient.getName() : patientToUpdate.getName())
                .withBirthDate(patientToUpdate.getBirthDate() == null ? patient.getBirthDate() : patientToUpdate.getBirthDate())
                .withSex(patientToUpdate.getSex() == null ? patient.getSex() : patientToUpdate.getSex())
                .withEmergencyContact(patientToUpdate.getEmergencyContact() == null ? patient.getEmergencyContact() : patientToUpdate.getEmergencyContact());

        return patientRepository.save(updatedPatient);
    }

    //List of visits for specific patient. In ConsultService?
    public List<Appointment> getVisitsForPatient(Long id) {
        return null;
    }

    // Delete patient for GDPR reasons ?


    private Patient getOrThrow(Long patientId) {
        return patientRepository.findById(patientId)
                .orElseThrow(() -> new ResourceNotFoundException("Could not find Patient with ID: %s".formatted(patientId)));
    }


}
