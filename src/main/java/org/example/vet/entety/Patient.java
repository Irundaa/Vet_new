package org.example.vet.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

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
    private Enum Type;
    private int age;
    private int weight;
}
