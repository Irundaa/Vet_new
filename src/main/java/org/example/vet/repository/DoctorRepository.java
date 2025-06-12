package org.example.vet.repository;

import org.example.vet.entety.Doctor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
