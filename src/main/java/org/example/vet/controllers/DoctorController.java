package org.example.vet.controllers;

import org.apache.commons.lang3.StringUtils;
import org.example.vet.DTO.DoctorDTO;
import org.example.vet.response.ResponseStatus;
import org.example.vet.response.VetResponse;
import org.example.vet.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/doctor")
public class DoctorController {

    private final DoctorService doctorService;
    private final RestClient.Builder builder;

    @Autowired
    public  DoctorController(DoctorService doctorService, RestClient.Builder builder) {
        this.doctorService = doctorService;
        this.builder = builder;
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
    public VetResponse deleteDoctor(@PathVariable("doctorId") Long doctorId) {
        VetResponse.VetResponseBuilder vetResponseBuilder = VetResponse.builder();
        try {
            doctorService.deleteById(doctorId);
            vetResponseBuilder.status(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            vetResponseBuilder.message(StringUtils.isEmpty(e.getMessage()) ? "Something went wrong" : e.getMessage());
            vetResponseBuilder.status(ResponseStatus.FAILURE);
        }
        return vetResponseBuilder.build();
    }

    @GetMapping(path = "/{doctorId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public VetResponse findDoctorById(@PathVariable Long doctorId) {
        VetResponse.VetResponseBuilder vetResponseBuilder = VetResponse.builder();
        try {
            vetResponseBuilder.entity(doctorService.findById(doctorId));
            vetResponseBuilder.status(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            vetResponseBuilder.message(StringUtils.isEmpty(e.getMessage()) ? "Something went wrong" : e.getMessage());
            vetResponseBuilder.status(ResponseStatus.FAILURE);
        }
        return vetResponseBuilder.build();
    }

    @GetMapping
    public List<DoctorDTO> getAllDoctors() {
        return doctorService.getAll();
    }

}