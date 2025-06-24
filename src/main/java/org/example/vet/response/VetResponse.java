package org.example.vet.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Builder
@Data
public class VetResponse<T> {
    private ResponseStatus status;
    private String message;
    private T entity;

}
