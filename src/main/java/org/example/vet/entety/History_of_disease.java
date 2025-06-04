package org.example.vet.entety;

import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class History_of_disease {
    private Long patient_id;
    private String name;
    private LocalDate start_date;
    private LocalDate end_date;
}
