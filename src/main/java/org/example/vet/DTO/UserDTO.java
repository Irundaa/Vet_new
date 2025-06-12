package org.example.vet.DTO;

import lombok.Builder;

@Builder
public class UserDTO {
    private long userId;
    private String username;
    private String password;
    private Enum role;
}
