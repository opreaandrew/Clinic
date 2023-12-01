package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private Specialization specialization;

    @OneToMany
    private List<ScheduledConsult> schedule;

}
