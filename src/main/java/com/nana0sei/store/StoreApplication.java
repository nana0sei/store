package com.nana0sei.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
      var context =  SpringApplication.run(StoreApplication.class, args);
      var userService = context.getBean(UserService.class);
      userService.registerUser(new User(1L, "nana@mail.com", "1234", "nana osei"));
      userService.registerUser(new User(1L, "nana@mail.com", "1234", "nana osei"));

    }

}
