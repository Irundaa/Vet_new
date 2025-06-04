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
public class VetController {

    private final VetService vetService;

    @Autowired
    public  VetController(VetService vetService) {
        this.vetService = vetService;
    }

//    @PostMapping
//    public void  registerNewDoctor(@RequestBody DoctorDTO doctorDTO) {
//
//    }

//    @PostMapping
//    public void  registerNewPatient(@RequestBody PatientDTO patientDTO) {
//
//    }
//
//    @PostMapping
//    public void  addNewAppointment(@RequestBody AppointmentDTO appointmentDTO) {
//
//    }
//
//    @PutMapping(path = "{doctorId}")
//    public void  updateDoctor(@RequestBody DoctorDTO doctorDTO,
//                               @PathVariable("doctorId") Long doctorId) {
//
//    }
//
//    @PutMapping(path = "{patientId}")
//    public void  updatePatient(@RequestBody PatientDTO patientDTO,
//                               @PathVariable("patientId") Long patientId) {
//
//    }
//
//    @PutMapping(path = "{appointmentId}")
//    public void  updateAppointment(@RequestBody AppointmentDTO appointmentDTO,
//                               @PathVariable("appointmentId") Long appointmentId) {
//
//    }
//
//    @DeleteMapping(path = "{doctorId}")
//    public void  deleteDoctor(@PathVariable("doctorId") Long doctorId) {
//
//    }
//
//    @DeleteMapping(path = "{patientId}")
//    public void  deletePatient(@PathVariable("patientId") Long patientId) {
//
//    }
//
//    @DeleteMapping(path = "{appointmentId}")
//    public void  deleteAppointment(@PathVariable("appointmentId") Long appointmentId) {
//
//    }
//
    @GetMapping("/{doctorId}")
    public Optional<String> findDoctorById(@PathVariable Long doctorId) {
        DoctorDTO.DoctorDTOBuilder builder = DoctorDTO.builder();
        builder.age(10);
        builder.experience(10);
        builder.room(10);
        DoctorDTO doctor = builder.build();
        return Optional.of("Hello world!");
    }
//
//    @GetMapping("/{patientId}")
//    public Optional<PatientDTO> findPatientById(@PathVariable Long patientId) {
//        return null;
//    }
//
//    @GetMapping
//    public List<DoctorDTO> getAllDoctors() {
//        return null;
//    }
//
//    @GetMapping
//    public List<PatientDTO> getAllPatients() {
//        return null;
//    }
//
//    @GetMapping
//    public List<UserDTO> getAllUsers() {
//        return null;
//    }
//
//    @GetMapping
//    public List<AppointmentDTO> getAllAppointments() {
//        return null;
//    }
}

//розділити на окремі контролери додати шлях