package org.example.vet.controllers;

import org.apache.commons.lang3.StringUtils;
import org.example.vet.DTO.AppointmentDTO;
import org.example.vet.DTO.DoctorDTO;
import org.example.vet.DTO.PatientDTO;
import org.example.vet.DTO.UserDTO;
import org.example.vet.response.ResponseStatus;
import org.example.vet.response.VetResponse;
import org.example.vet.service.DoctorService;
import org.example.vet.service.PatientService;
import org.example.vet.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {
    private final PatientService patientService;
    private final RestClient.Builder builder;

    @Autowired
    public  PatientController(PatientService patientService, RestClient.Builder builder) {
        this.patientService = patientService;
        this.builder = builder;
    }

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

    @GetMapping(path = "/{patientId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public VetResponse findPatientById(@PathVariable Long patientId) {
        VetResponse.VetResponseBuilder vetResponseBuilder = VetResponse.builder();
        try {
            vetResponseBuilder.entity(patientService.findById(patientId));
            vetResponseBuilder.status(org.example.vet.response.ResponseStatus.SUCCESS);
        } catch (Exception e) {
            vetResponseBuilder.message(StringUtils.isEmpty(e.getMessage()) ? "Something went wrong" : e.getMessage());
            vetResponseBuilder.status(ResponseStatus.FAILURE);
        }
        return vetResponseBuilder.build();
    }

    @GetMapping
    public List<PatientDTO> getAllPatients() {
        return null;
    }
}