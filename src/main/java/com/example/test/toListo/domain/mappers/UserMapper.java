package com.example.test.toListo.domain.mappers;

import com.example.test.toListo.domain.model.User;
import com.example.test.toListo.infrastructure.controllers.dto.UserDto;
import com.example.test.toListo.infrastructure.repository.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto modelToDto(User user);
    UserEntity modelToEntity(User user);
    User dtoToModel(UserDto dto);
    User entityToModel(UserEntity entity);
}
