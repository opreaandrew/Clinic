package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.GenerationType.*;

@Builder
@With
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private LocalDate birthDate;
    private Sex sex;
    private String emergencyContact;

    @OneToMany
    private List<Appointment> appointments;

}
