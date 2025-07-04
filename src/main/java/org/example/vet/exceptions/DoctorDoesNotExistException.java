package org.example.vet.exceptions;

public class DoctorDoesNotExistException extends IllegalArgumentException {
    public DoctorDoesNotExistException(String message) {
        super(message);
    }
}
