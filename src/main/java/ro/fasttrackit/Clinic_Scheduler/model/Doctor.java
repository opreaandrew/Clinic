package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Builder
@With
public class Doctor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private Specialization specialization;

    @OneToMany
    private List<ScheduledConsult> schedule;

    public ScheduledConsult addConsult(ScheduledConsult newSchedule){
        schedule.add(newSchedule);
        return newSchedule;
    }
}