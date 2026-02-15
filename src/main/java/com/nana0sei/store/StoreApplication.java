package com.nana0sei.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
      var context =  SpringApplication.run(StoreApplication.class, args);
      var notificationManager = context.getBean(NotificationManager.class);
      notificationManager.sendNotification();
    }

}
