package org.example.vet.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Optional;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    private Long patientId;
    private Long userId;
    private String name;
    private String type;
    private Optional<Integer> age;
    private Optional<Integer> weight;
}
