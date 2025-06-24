package org.example.vet.entety;

import lombok.*;

import java.util.Optional;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Doctor {

    private Long doctorId;
    private Long userId;
    private String firstName;
    private String lastName;
    private int age;
    private int experience;
    private Optional<Integer> room;

    private Doctor(DoctorBuilder builder) {
        this.doctorId = builder.doctorId;
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.experience = builder.experience;
        this.room = Optional.ofNullable(builder.room);
    }

    public Long getDoctorId() { return doctorId; }
    public Long getUserId() { return userId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public int getExperience() { return experience; }
    public Optional<Integer> getRoom() { return room; }

    public static class DoctorBuilder {
        private Long doctorId;
        private Long userId;
        private String firstName;
        private String lastName;
        private int age;
        private int experience;
        private Integer room;

        public DoctorBuilder doctorId(Long doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public DoctorBuilder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public DoctorBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public DoctorBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public DoctorBuilder age(int age) {
            this.age = age;
            return this;
        }

        public DoctorBuilder experience(int experience) {
            this.experience = experience;
            return this;
        }

        public DoctorBuilder room(Integer room) {
            this.room = room;
            return this;
        }

        public Doctor build() {
            return new Doctor(this);
        }
    }
}