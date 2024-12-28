package com.ditto.authsystem.service;

import com.ditto.authsystem.dto.UserRegistrationDto;

public interface UserService {
    void registerUser(UserRegistrationDto userDto);
}
