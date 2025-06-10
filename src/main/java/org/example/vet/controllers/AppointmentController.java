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
public class AppointmentController {

    private final VetService vetService;

    @Autowired
    public AppointmentController(VetService vetService) {
        this.vetService = vetService;
    }

    @PostMapping
    public void  addNewAppointment(@RequestBody AppointmentDTO appointmentDTO) {

    }

    @PutMapping(path = "{appointmentId}")
    public void  updateAppointment(@RequestBody AppointmentDTO appointmentDTO,
                                   @PathVariable("appointmentId") Long appointmentId) {

    }

    @DeleteMapping(path = "{appointmentId}")
    public void  deleteAppointment(@PathVariable("appointmentId") Long appointmentId) {

    }

//    @GetMapping
//    public List<UserDTO> getAllUsers() {
//        return null;
//    }

    @GetMapping
    public List<AppointmentDTO> getAllAppointments() {
        return null;
    }
}

//розділити на окремі контролери додати шлях