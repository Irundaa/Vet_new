package org.example.vet.controllers;

import org.example.vet.DTO.DoctorDTO;
import org.example.vet.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public  DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public void  registerNewDoctor(@RequestBody DoctorDTO doctorDTO) {
        doctorService.insert(doctorDTO);
    }

    @PutMapping(path = "{doctorId}")
    public void  updateDoctor(@RequestBody DoctorDTO doctorDTO,
                               @PathVariable("doctorId") Long doctorId) {
        doctorService.update(doctorDTO, doctorId);

    }

    @DeleteMapping(path = "{doctorId}")
    public void  deleteDoctor(@PathVariable("doctorId") Long doctorId) {
        doctorService.deleteById(doctorId);
    }

    @GetMapping(path = "/{doctorId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public DoctorDTO findDoctorById(@PathVariable Long doctorId) {
//        DoctorDTO.DoctorDTOBuilder builder = DoctorDTO.builder();
//        builder.age(10);
//        builder.experience(10);
//        builder.room(Optional.of(10));
//        DoctorDTO doctor = builder.build();
//        return Optional.of("Hello world!");
        return doctorService.findById(doctorId);
    }

    @GetMapping
    public List<DoctorDTO> getAllDoctors() {
        return doctorService.getAll();
    }

}