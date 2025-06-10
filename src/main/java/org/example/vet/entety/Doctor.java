package org.example.vet.entety;

import lombok.*;

@Getter
@Setter
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