package org.example.vet.repository;

import org.example.vet.DTO.DoctorDTO;
import org.example.vet.entety.Doctor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//автовайред зробити
@Repository
public class DoctorRepository {
    private final JdbcTemplate jdbcTemplate;

    public DoctorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Doctor> getAll() {
        return jdbcTemplate.query("SELECT first_name AS firstName, last_name AS lastName, age, experience, room FROM doctor;", new BeanPropertyRowMapper<>(Doctor.class));
    }

    public Doctor findDoctorById (Long doctorId) {
        return jdbcTemplate.queryForObject("SELECT first_name AS firstName, last_name AS lastName, age, experience, room FROM doctor  WHERE doctor_id=" + doctorId + ";", new BeanPropertyRowMapper<>(Doctor.class));
    }

    public void deleteDoctorById (Long doctorId) {
        jdbcTemplate.update("DELETE FROM doctor WHERE doctor_id=" + doctorId + ";");
    }

    public void updateDoctor (DoctorDTO doctorDTO, Long doctorId) {
        jdbcTemplate.update("UPDATE doctor\n" +
                "SET first_name=?, last_name=?, age=?, experience=?, room=?\n" +
                "WHERE doctor_id=?;\n", doctorDTO.getFirstName(), doctorDTO.getLastName(), doctorDTO.getAge(), doctorDTO.getExperience(), doctorDTO.getRoom().orElse(null), doctorId);
    }

    public void insertDoctor (DoctorDTO doctorDTO) {
        String firstName = doctorDTO.getFirstName();
        String lastName = doctorDTO.getLastName();
        int age = doctorDTO.getAge();
        int experience = doctorDTO.getExperience();
        Optional<Integer> room = doctorDTO.getRoom();
        jdbcTemplate.update("INSERT INTO doctor (first_name, last_name, age, experience, room) VALUES\n" +
                "(?, ?, ?, ?, ?);\n", firstName, lastName, age, experience, room.orElse(null));
    }
}

