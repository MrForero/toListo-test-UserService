package com.example.test.toListo.domain.exceptions;

public class UserException extends Exception{
    public static final String USER_NOT_FOUND = "Usuario no encontrado";
    public UserException(String msg){ super(msg);}
}
