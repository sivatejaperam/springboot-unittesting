package com.sivateja.springboot_unitesting.controller;

import com.sivateja.springboot_unitesting.model.User;
import com.sivateja.springboot_unitesting.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();
    }
}
