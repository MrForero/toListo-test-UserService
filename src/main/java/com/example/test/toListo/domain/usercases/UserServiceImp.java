package com.example.test.toListo.domain.usercases;

import com.example.test.toListo.domain.exceptions.UserException;
import com.example.test.toListo.domain.mappers.UserMapper;
import com.example.test.toListo.domain.model.User;
import com.example.test.toListo.domain.ports.UserService;
import com.example.test.toListo.infrastructure.repository.UserRepository;
import com.example.test.toListo.infrastructure.repository.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper mapper;

    @Override
    public User getUser(String id) throws UserException {

        Optional<UserEntity> req = userRepository.findById(id);
        if(req.isEmpty()){
            throw new UserException(UserException.USER_NOT_FOUND);
        } else {
            return mapper.entityToModel(req.get());
        }
    }
}
