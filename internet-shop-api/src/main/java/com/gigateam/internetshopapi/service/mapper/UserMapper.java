package com.gigateam.internetshopapi.service.mapper;

import com.gigateam.internetshopapi.commons.dto.user.UserDto;
import com.gigateam.internetshopapi.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true)
    })
    public abstract User toEntity(UserDto dto);

    public abstract UserDto toDto(User entity);

}