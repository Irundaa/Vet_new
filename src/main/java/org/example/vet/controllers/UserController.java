package org.example.vet.controllers;


import org.example.vet.DTO.UserDTO;
import org.example.vet.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return null;
    }
}
