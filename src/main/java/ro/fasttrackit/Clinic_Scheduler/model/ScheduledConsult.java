package ro.fasttrackit.Clinic_Scheduler.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduledConsult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne
    private Doctor doctor;
}
