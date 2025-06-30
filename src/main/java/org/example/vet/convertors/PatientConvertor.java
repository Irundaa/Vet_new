package org.example.vet.convertors;

import org.example.vet.DTO.DoctorDTO;
import org.example.vet.DTO.PatientDTO;
import org.example.vet.entety.Doctor;
import org.example.vet.entety.Patient;
import org.example.vet.entety.Type;
import org.springframework.stereotype.Component;

@Component
public class PatientConvertor {
    public PatientDTO convert(Patient patient) {
        PatientDTO.PatientDTOBuilder builder = new PatientDTO.PatientDTOBuilder();
        builder.name(patient.getName());
        builder.type(patient.getType());
        builder.age(patient.getAge());
        builder.weight(patient.getWeight());
        return builder.build();
    }

    public Patient convert(PatientDTO patientDTO) {
        Patient.PatientBuilder builder = Patient.builder();
        builder.name(patientDTO.getName());
        builder.type(patientDTO.getType());
        builder.age(patientDTO.getAge());
        builder.weight(patientDTO.getWeight());
        return builder.build();
    }
}