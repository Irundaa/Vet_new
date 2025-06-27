package org.example.vet.repository;

import org.example.vet.entety.Doctor;
import org.example.vet.entety.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PatientRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Patient findPatientById (Long patientId) {
        try {
            return jdbcTemplate.queryForObject(String.format("SELECT  name, type, age, weight FROM patient WHERE patient_id=%s;", patientId), new BeanPropertyRowMapper<>(Patient.class));
        } catch (Exception e) {
            return null;
        }
    }
}
