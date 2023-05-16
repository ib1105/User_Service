package com.example.userservices.service;

import com.example.userservices.dto.UserDto;
import com.example.userservices.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}