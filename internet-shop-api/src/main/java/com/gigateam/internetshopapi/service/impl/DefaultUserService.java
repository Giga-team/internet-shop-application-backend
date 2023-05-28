package com.gigateam.internetshopapi.service.impl;

import com.gigateam.internetshopapi.commons.dto.user.UserDto;
import com.gigateam.internetshopapi.repository.UserRepository;
import com.gigateam.internetshopapi.service.UserService;
import com.gigateam.internetshopapi.service.mapper.UserMapper;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultUserService implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public Optional<UserDto> findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDto);
    }

}