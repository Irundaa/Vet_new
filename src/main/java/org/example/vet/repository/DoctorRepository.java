package org.example.vet.repository;

import org.example.vet.entety.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DoctorRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DoctorRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Doctor> getAll() {
        return jdbcTemplate.query("SELECT first_name AS firstName, last_name AS lastName, age, experience, room FROM doctor;", new BeanPropertyRowMapper<>(Doctor.class));
    }

    public Doctor findDoctorById (Long doctorId) {
        try {
            return jdbcTemplate.queryForObject(String.format("SELECT first_name AS firstName, last_name AS lastName, age, experience, room FROM doctor  WHERE doctor_id=%s;", doctorId), new BeanPropertyRowMapper<>(Doctor.class));
        } catch (Exception e) {
            return null;
        }
    }

    public void deleteDoctorById (Long doctorId) {
        jdbcTemplate.update("DELETE FROM doctor WHERE doctor_id=?",  doctorId);
    }

    public void updateDoctor (Doctor doctor, Long doctorId) {
        jdbcTemplate.update("UPDATE doctor\n" +
                "SET first_name=?, last_name=?, age=?, experience=?, room=?\n" +
                "WHERE doctor_id=?;\n", doctor.getFirstName(), doctor.getLastName(), doctor.getAge(), doctor.getExperience(), doctor.getRoom().orElse(null), doctorId);
    }

    public void insertDoctor (Doctor doctor) {
        jdbcTemplate.update("INSERT INTO doctor (first_name, last_name, age, experience, room) VALUES\n" +
                "(?, ?, ?, ?, ?);\n", doctor.getFirstName(), doctor.getLastName(), doctor.getAge(), doctor.getExperience(), doctor.getRoom().orElse(null));
    }
}

