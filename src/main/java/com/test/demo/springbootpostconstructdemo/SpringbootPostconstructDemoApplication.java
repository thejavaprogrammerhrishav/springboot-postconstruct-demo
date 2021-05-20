package com.test.demo.springbootpostconstructdemo;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPostconstructDemoApplication {

//    @Autowired
//    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPostconstructDemoApplication.class, args);
    }

//    @PostConstruct
//    private void doOnInit(){
//        for(int i=1;i<=15;i++){
//            userRepository.save(new User("User-"+i, "Password - "+i));
//        }
//    }

}
