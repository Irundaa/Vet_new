package org.example.vet.entety;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Doctor {

    private Long doctorId;
    private Long userId;
    private String firstName;
    private String lastName;
    private int age;
    private int experience;
    private int room;
}

//rename
//clean