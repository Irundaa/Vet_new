package org.example.vet.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private long userId;
    private String username;
    private String password;
    private Enum role;
}
