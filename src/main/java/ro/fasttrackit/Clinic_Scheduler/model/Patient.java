package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@With
public class Patient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private LocalDate birthDate;
    private Sex sex;
    private String emergencyContact;

    // Link to consults, somehow
    private String medicalHistory;

}
