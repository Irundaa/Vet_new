package org.example.vet.DTO;

import lombok.Builder;
import lombok.Getter;

import java.util.Optional;

@Builder
@Getter
public class DoctorDTO {
    private Long doctorId;
    private Long userId;
    private String firstName;
    private String lastName;
    private int age;
    private int experience;
    private Optional<Integer> room;
}
