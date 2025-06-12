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
        return null;
    }
//    private DoctorDTO convert(Doctor doctor)  {
//
//    }
}





