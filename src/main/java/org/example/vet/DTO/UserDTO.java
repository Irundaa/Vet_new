package org.example.vet.DTO;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserDTO {
    private long userId;
    private String username;
    private String password;
    private Enum role;
}
