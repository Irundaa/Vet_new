package org.example.vet.DTO;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class AppointmentDTO {
    private Long appointmentId;
    private Long doctorId;
    private Long patientId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
}
