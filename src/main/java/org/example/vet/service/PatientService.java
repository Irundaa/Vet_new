package org.example.vet.service;

import lombok.RequiredArgsConstructor;
import org.example.vet.DTO.PatientDTO;
import org.example.vet.convertors.PatientConvertor;
import org.example.vet.entety.Patient;
import org.example.vet.exceptions.PatientDoesNotExistException;
import org.example.vet.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    @Autowired
    private final PatientRepository patientRepository;
    @Autowired
    private final PatientConvertor patientConvertor;

    public PatientDTO findById(Long patientId) {
        if (patientRepository.findPatientById(patientId) == null) {
            throw new PatientDoesNotExistException(String.format("Patient with id %s does not exist", patientId));
        }
        Patient patient = patientRepository.findPatientById(patientId);
        return convertPatient(patient);
    }

    public PatientDTO convertPatient(Patient patient)  {
        return patientConvertor.convert(patient);
    }
    public Patient convertDTO(PatientDTO patientDTO)  { return patientConvertor.convert(patientDTO); }
}
