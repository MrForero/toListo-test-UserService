package com.example.test.toListo.domain.ports;

import com.example.test.toListo.domain.exceptions.UserException;
import com.example.test.toListo.domain.model.User;

public interface UserService {

    User getUser(String id) throws UserException;


}
