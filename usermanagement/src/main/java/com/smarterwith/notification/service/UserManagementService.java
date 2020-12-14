package com.smarterwith.notification.service;


import com.smarterwith.notification.dto.UserDto;
import com.smarterwith.notification.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserManagementService {

    private final UserRepository userRepository;

    public List<UserDto> getUsers(){
        return userRepository.findAll().stream().map(UserDto::toDto).collect(Collectors.toList());
    }

    public void createUser(UserDto dto){
        userRepository.save(UserDto.toDomainObject(dto));
    }



}
