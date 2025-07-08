package org.example.vet.convertors;

import org.example.vet.DTO.PatientDTO;
import org.example.vet.entety.Patient;
import org.example.vet.entety.Type;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import static org.example.vet.entety.Type.DOG;

@RunWith(MockitoJUnitRunner.class)
class PatientConvertorTest {

    public PatientConvertor patientConvertor = new PatientConvertor();

    private static final String NAME = "Duke";
    private static final String TYPE_STRING = "DOG";
    private static final Type TYPE = DOG;
    private static final Optional<Integer> AGE = Optional.of(10);
    private static final Optional<Integer> WEIGHT = Optional.of(20);
//    private final Patient patient = new Patient(null, null, NAME, TYPE_STRING, AGE, WEIGHT);

    @Test
    public void testConvertPatient() {
        PatientDTO patientDTO = patientConvertor.convert(build());

        assertNotNull(patientDTO);
        assertEquals(NAME, patientDTO.getName());
        assertEquals(Type.valueOf(TYPE_STRING), patientDTO.getType());
        assertEquals(AGE, patientDTO.getAge());
        assertEquals(WEIGHT, patientDTO.getWeight());
    }

    @Test
    public void testConvertPatientEssentials() {
        Patient.PatientBuilder builder = Patient.builder();
        builder.name(NAME);
        builder.type(TYPE_STRING);
        PatientDTO patientDTO = patientConvertor.convert(builder.build());

        assertNotNull(patientDTO);
        assertEquals(NAME, patientDTO.getName());
        assertEquals(TYPE, patientDTO.getType());
    }

    @Test
    public void testConvertDTO() {
        Patient patient = patientConvertor.convert(buildDTO());

        assertNotNull(patient);
        assertEquals(NAME, patient.getName());
        assertEquals(TYPE_STRING, patient.getType());
        assertEquals(AGE, patient.getAge());
        assertEquals(WEIGHT, patient.getWeight());
    }

    @Test
    public void testConvertDTOEssentials() {
        PatientDTO.PatientDTOBuilder builder = new PatientDTO.PatientDTOBuilder();
        builder.name(NAME);
        builder.type(TYPE);
        Patient patient = patientConvertor.convert(builder.build());

        assertNotNull(patient);
        assertEquals(NAME, patient.getName());
        assertEquals(TYPE_STRING, patient.getType());
    }

    public PatientDTO buildDTO() {
        PatientDTO.PatientDTOBuilder builder = new PatientDTO.PatientDTOBuilder();
        builder.name(NAME);
        builder.type(TYPE);
        builder.age(AGE);
        builder.weight(WEIGHT);
        return builder.build();
    }
    public Patient build() {
        Patient.PatientBuilder builder = Patient.builder();
        builder.name(NAME);
        builder.type(TYPE_STRING);
        builder.age(AGE);
        builder.weight(WEIGHT);
        return builder.build();
    }
}