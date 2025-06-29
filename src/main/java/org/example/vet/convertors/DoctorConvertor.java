package org.example.vet.convertors;

import org.example.vet.DTO.DoctorDTO;
import org.example.vet.entety.Doctor;
import org.springframework.stereotype.Component;

@Component
public class DoctorConvertor {
    public DoctorDTO convert(Doctor doctor) {
        DoctorDTO.DoctorDTOBuilder builder = DoctorDTO.builder();
        builder.firstName(doctor.getFirstName());
        builder.lastName(doctor.getLastName());
        builder.age(doctor.getAge());
        builder.experience(doctor.getExperience());
        builder.room(doctor.getRoom());
        return builder.build();
    }

    public Doctor convert(DoctorDTO doctorDTO) {
        Doctor.DoctorBuilder builder = new Doctor.DoctorBuilder();
        builder.firstName(doctorDTO.getFirstName());
        builder.lastName(doctorDTO.getLastName());
        builder.age(doctorDTO.getAge());
        builder.experience(doctorDTO.getExperience());
        doctorDTO.getRoom().ifPresent(builder::room);
        return builder.build();
    }
}