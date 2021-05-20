package com.test.demo.springbootpostconstructdemo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PreDataLoader {

    @Autowired
    private UserRepository userRepository;


    @PostConstruct
    private void doOnInit(){
        for(int i=100;i<=150;i++){
            userRepository.save(new User("User-"+i, "Password - "+i));
        }
    }
}
