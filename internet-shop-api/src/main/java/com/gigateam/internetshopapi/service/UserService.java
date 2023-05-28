package com.gigateam.internetshopapi.service;

import com.gigateam.internetshopapi.commons.dto.user.UserDto;
import java.util.Optional;

public interface UserService {

    Optional<UserDto> findById(Long id);

}