package com.example.test.toListo.infrastructure.controllers;


import com.example.test.toListo.domain.exceptions.UserException;
import com.example.test.toListo.domain.mappers.UserMapper;
import com.example.test.toListo.domain.ports.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class userController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper mapper;

    @GetMapping("/{Id}")
    public ResponseEntity<?> getUser(@PathVariable String Id){
        try{
            return ResponseEntity.ok(mapper.modelToDto(this.userService.getUser(Id)));
        } catch (UserException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
