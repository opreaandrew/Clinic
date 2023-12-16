package ro.fasttrackit.Clinic_Scheduler.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
@Builder
@With
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewAppointment {
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private final AppointmentStatus status = AppointmentStatus.SCHEDULED;
    private Long doctor; // doctor ID
    private Long patient; // patient ID
}
