package org.example.vet.entety;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Doctor {

    private Long doctor_id;
    private Long user_id;
    private String first_name;
    private String last_name;
    private int age;
    private int experience;
    private int room;
}

//rename
//clean