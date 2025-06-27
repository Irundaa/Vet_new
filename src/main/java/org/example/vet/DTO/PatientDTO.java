package org.example.vet.DTO;

import lombok.Builder;
import lombok.Getter;
import org.example.vet.entety.Type;

import java.util.Optional;

@Builder
@Getter
public class PatientDTO {
    private Long patientId;
    private Long userId;
    private String name;
    private String type;
    private Optional<Integer> age;
    private Optional<Integer> weight;

//    private PatientDTO(PatientDTOBuilder builder) {
//        this.patientId = builder.patientId;
//        this.userId = builder.userId;
//        this.name = builder.name;
//        this.type = builder.type;
//        this.age = Optional.ofNullable(builder.age);
//        this.weight = Optional.ofNullable(builder.weight);
//    }
//
//    public Long getPatientId() { return patientId; }
//    public Long getUserId() { return userId; }
//    public String getName() { return name; }
//    public Type getType() { return type; }
//    public Optional<Integer> getAge() { return age; }
//    public Optional<Integer> getWeight() { return weight; }
//
//    public static class PatientDTOBuilder {
//        private Long patientId;
//        private Long userId;
//        private String name;
//        private Type type;
//        private Integer age;
//        private Integer weight;
//
//        public PatientDTOBuilder patientId(Long patientId) {
//            this.patientId = patientId;
//            return this;
//        }
//
//        public PatientDTOBuilder userId(Long userId) {
//            this.userId = userId;
//            return this;
//        }
//
//        public PatientDTOBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public PatientDTOBuilder type(Type type) {
//            this.type = type;
//            return this;
//        }
//
//        public PatientDTOBuilder age(Integer age) {
//            this.age = age;
//            return this;
//        }
//
//        public PatientDTOBuilder weight(Integer weight) {
//            this.weight = weight;
//            return this;
//        }
//
//        public PatientDTO build() {
//            return new PatientDTO(this);
//        }
//    }
}
