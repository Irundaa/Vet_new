package org.example.vet.entety;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class HistoryOfDisease {
    private Long patientId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
}
