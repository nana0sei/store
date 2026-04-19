package com.nana0sei.store;

import com.nana0sei.store.entities.Address;
import com.nana0sei.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//    SpringApplication.run(StoreApplication.class, args);

        var user = User.builder()
                .name("name")
                .email("email")
                .password("password")
                .build();

        var address = Address.builder()
                .street("street")
                .city("city")
                .state("state")
                .zip("zip")
                .build();

        user.addAddress(address);
        System.out.println(user.toString());
    }

}
