package com.codeWithOmar.store.exercise2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplicationExo2 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplicationExo2.class, args);
//		var orderService = context.getBean(OrderService.class);
//        var orderService2 = context.getBean(OrderService.class);
//		orderService.placeOrder();
//        context.close();

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "codewithomar@com.com", "12345", "Codewith"));
        userService.registerUser(new User(1L, "codewithomar@com.com", "12345", "Codewith")); // testing duplicate
    }

}
