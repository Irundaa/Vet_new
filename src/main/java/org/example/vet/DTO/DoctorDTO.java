package org.example.vet.DTO;

import lombok.Builder;

@Builder
public class DoctorDTO {
    private Long doctor_id;
    private Long user_id;
    private String first_name;
    private String last_name;
    private int age;
    private int experience;
    private int room;
}
