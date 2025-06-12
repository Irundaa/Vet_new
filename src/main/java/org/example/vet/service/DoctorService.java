package org.example.vet.service;

import lombok.RequiredArgsConstructor;
import org.example.vet.DTO.DoctorDTO;
import org.example.vet.controllers.DoctorController;
import org.example.vet.convertors.DoctorConvertor;
import org.example.vet.entety.Doctor;
import org.example.vet.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorService {
    @Autowired
    private final DoctorRepository doctorRepository;
    @Autowired
    private final DoctorConvertor doctorConvertor;

//    @Autowired
//    public DoctorService(DoctorRepository doctorRepository, DoctorConvertor doctorConvertor) {
//        this.doctorRepository = doctorRepository;
//        this.doctorConvertor = doctorConvertor;
//    }

    public List<DoctorDTO> getAll() {
        List<Doctor> doctors = doctorRepository.getAll();
        return doctors.stream().map(doctorConvertor::convert).collect(Collectors.toList());
    }

    public DoctorDTO findById(Long doctorId) {
        Doctor doctor = doctorRepository.findDoctorById(doctorId);
        DoctorDTO doctorDTO = doctorConvertor.convert(doctor);
        return doctorDTO;
    }

    public DoctorDTO convert(Doctor doctor)  {
        return doctorConvertor.convert(doctor);
    }
}





