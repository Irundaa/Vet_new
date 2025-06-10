package org.example.vet.DTO;

import lombok.Builder;
import org.example.vet.entety.Type;

import java.util.Optional;

public class PatientDTO {
    private final Long patientId;
    private final Long userId;
    private final String name;
    private final Type type;
    private final Optional<Integer> age;
    private final Optional<Integer> weight;

    private PatientDTO(PatientDTOBuilder builder) {
        this.patientId = builder.patientId;
        this.userId = builder.userId;
        this.name = builder.name;
        this.type = builder.type;
        this.age = Optional.ofNullable(builder.age);
        this.weight = Optional.ofNullable(builder.weight);
    }

    public Long getPatientId() { return patientId; }
    public Long getUserId() { return userId; }
    public String getName() { return name; }
    public Type getType() { return type; }
    public Optional<Integer> getAge() { return age; }
    public Optional<Integer> getWeight() { return weight; }

    public static class PatientDTOBuilder {
        private final Long patientId;
        private final Long userId;
        private final String name;
        private final Type type;
        private Integer age;
        private Integer weight;

        public PatientDTOBuilder(Long patientId, Long userId, String name, Type type) {
            this.patientId = patientId;
            this.userId = userId;
            this.name = name;
            this.type = type;
        }

        public PatientDTOBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PatientDTOBuilder weight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public PatientDTO build() {
            return new PatientDTO(this);
        }
    }
}
