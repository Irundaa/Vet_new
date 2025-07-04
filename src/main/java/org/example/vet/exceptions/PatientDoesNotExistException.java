package org.example.vet.exceptions;

public class PatientDoesNotExistException extends IllegalArgumentException {
    public PatientDoesNotExistException(String message) {
        super(message);
    }
}
