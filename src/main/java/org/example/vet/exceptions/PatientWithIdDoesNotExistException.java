package org.example.vet.exceptions;

public class PatientWithIdDoesNotExistException extends IllegalArgumentException {
    public PatientWithIdDoesNotExistException(String message) {
        super(message);
    }
}
