package com.thinhreal.model_mapper.controller;

import com.thinhreal.model_mapper.model.dto.UserDTO;
import com.thinhreal.model_mapper.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test-mapping")
    public UserDTO testMapping() {
        return userService.getMockUser();
    }
}