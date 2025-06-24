package org.example.vet.exceptions;

public class DoctorWithIdDoesNotExistException extends IllegalArgumentException {
    public DoctorWithIdDoesNotExistException(String message, Long doctorId) {
        super(message);
    }
}
