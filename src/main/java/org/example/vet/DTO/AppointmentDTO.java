package org.example.vet.DTO;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class AppointmentDTO {
    private Long appointmentId;
    private Long doctorId;
    private Long patientId;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
}
