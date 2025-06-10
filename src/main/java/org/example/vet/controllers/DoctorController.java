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
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {

    private final VetService vetService;

    @Autowired
    public  DoctorController(VetService vetService) {
        this.vetService = vetService;
    }

    @PostMapping
    public void  registerNewDoctor(@RequestBody DoctorDTO doctorDTO) {

    }

    @PutMapping(path = "{doctorId}")
    public void  updateDoctor(@RequestBody DoctorDTO doctorDTO,
                               @PathVariable("doctorId") Long doctorId) {

    }

    @DeleteMapping(path = "{doctorId}")
    public void  deleteDoctor(@PathVariable("doctorId") Long doctorId) {

    }

    @GetMapping("/{doctorId}")
    public Optional<String> findDoctorById(@PathVariable Long doctorId) {
        DoctorDTO.DoctorDTOBuilder builder = DoctorDTO.builder();
        builder.age(10);
        builder.experience(10);
        builder.room(10);
        DoctorDTO doctor = builder.build();
        return Optional.of("Hello world!");
    }

    @GetMapping
    public List<DoctorDTO> getAllDoctors() {
        return null;
    }

}