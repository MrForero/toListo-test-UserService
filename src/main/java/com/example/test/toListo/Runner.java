package com.example.test.toListo;

import com.example.test.toListo.infrastructure.repository.UserRepository;
import com.example.test.toListo.infrastructure.repository.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        UserEntity user1 = new UserEntity();
        user1.setId("user-001");
        user1.setName("John");
        user1.setLastName("Doe");
        user1.setEmail("john.doe@example.com");

        UserEntity user2 = new UserEntity();
        user2.setId("user-002");
        user2.setName("Jane");
        user2.setLastName("Smith");
        user2.setEmail("jane.smith@example.com");

        userRepository.save(user1);
        userRepository.save(user2);

        System.out.println("Sample users have been successfully added.");
    }
}
