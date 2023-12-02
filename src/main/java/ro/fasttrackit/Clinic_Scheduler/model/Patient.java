package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.EnumType.STRING;
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
    private String emergencyContact;

    @Enumerated(value = STRING)
    private Sex sex;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

}
