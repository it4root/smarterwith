package com.smarterwith.notification.controller;


import com.smarterwith.notification.dto.UserDto;
import com.smarterwith.notification.service.UserManagementService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@Api("/v1/api/users")
@RequestMapping("/v1/api")
public class UserManagementController {

    private UserManagementService userManagementService;

    @PostMapping("/users")
    public void createUser(@Valid @RequestBody UserDto user) {
        userManagementService.createUser(user);
    }

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return userManagementService.getUsers();
    }

    @GetMapping("/users/health")
    public String health() {
        return "OK";
    }
}
