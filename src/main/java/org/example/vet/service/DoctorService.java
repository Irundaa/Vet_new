package org.example.vet.service;

import lombok.RequiredArgsConstructor;
import org.example.vet.DTO.DoctorDTO;
import org.example.vet.convertors.DoctorConvertor;
import org.example.vet.entety.Doctor;
import org.example.vet.exceptions.DoctorWithIdDoesNotExistException;
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

    public List<DoctorDTO> getAll() {
        List<Doctor> doctors = doctorRepository.getAll();
        return doctors.stream().map(this::convertDoctor).collect(Collectors.toList());
    }

    public DoctorDTO findById(Long doctorId) {
        if (doctorRepository.findDoctorById(doctorId) == null) {
            throw new DoctorWithIdDoesNotExistException(String.format("Doctor with id %s does not exist", doctorId));
        }
        Doctor doctor = doctorRepository.findDoctorById(doctorId);
        DoctorDTO doctorDTO = convertDoctor(doctor);
        return doctorDTO;
    }

    public void deleteById(Long doctorId) {
        if (doctorRepository.findDoctorById(doctorId) == null) {
            throw new DoctorWithIdDoesNotExistException(String.format("Doctor with id %s does not exist", doctorId));
        }
        doctorRepository.deleteDoctorById(doctorId);
    }

    public void update(DoctorDTO doctorDTO, Long doctorId) {
        doctorRepository.updateDoctor(convertDTO(doctorDTO), doctorId);
    }

    public void insert(DoctorDTO doctorDTO) {
        doctorRepository.insertDoctor(convertDTO(doctorDTO));
    }

    public DoctorDTO convertDoctor(Doctor doctor)  {
        return doctorConvertor.convert(doctor);
    }
    public Doctor convertDTO(DoctorDTO doctorDTO)  { return doctorConvertor.convert(doctorDTO); }
}





