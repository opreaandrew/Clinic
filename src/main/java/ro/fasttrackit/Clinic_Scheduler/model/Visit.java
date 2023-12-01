package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Visit {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;
    private LocalDate visitDate;
    private String visitReason;
    private String diagnostic;


}
