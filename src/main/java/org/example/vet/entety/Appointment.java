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
    private Long appointmentId;
    private Long doctorId;
    private Long patientId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
}
