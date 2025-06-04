package org.example.vet.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Appointment {
    private Long appointment_id;
    private Long doctor_id;
    private Long patient_id;
    private LocalDateTime start_date_time;
    private LocalDateTime end_date_time;
}
