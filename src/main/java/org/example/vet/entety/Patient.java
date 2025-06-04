package org.example.vet.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    private Long patient_id;
    private Long user_id;
    private String name;
    private Enum Type;
    private int age;
    private int weight;
}
