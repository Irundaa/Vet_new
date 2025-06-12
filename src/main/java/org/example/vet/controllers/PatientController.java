package org.example.vet.controllers;

import org.example.vet.DTO.AppointmentDTO;
import org.example.vet.DTO.DoctorDTO;
import org.example.vet.DTO.PatientDTO;
import org.example.vet.DTO.UserDTO;
import org.example.vet.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {

    @PostMapping
    public void  registerNewPatient(@RequestBody PatientDTO patientDTO) {

    }

    @PutMapping(path = "{patientId}")
    public void  updatePatient(@RequestBody PatientDTO patientDTO,
                               @PathVariable("patientId") Long patientId) {

    }

    @DeleteMapping(path = "{patientId}")
    public void  deletePatient(@PathVariable("patientId") Long patientId) {

    }

    @GetMapping("/{patientId}")
    public Optional<PatientDTO> findPatientById(@PathVariable Long patientId) {
        return null;
    }

    @GetMapping
    public List<PatientDTO> getAllPatients() {
        return null;
    }
}