package com.codeWithOmar.store;

import com.codeWithOmar.store.exercise2.User;
import com.codeWithOmar.store.exercise2.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
<<<<<<< HEAD
//		var orderService = context.getBean(OrderService.class);
//        var orderService2 = context.getBean(OrderService.class);
//		orderService.placeOrder();
//        context.close();

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "codewithomar@com.com", "12345", "Codewith"));
        userService.registerUser(new User(1L, "codewithomar@com.com", "12345", "Codewith")); // testing duplicate
=======
		var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);
		orderService.placeOrder();
>>>>>>> afaf015a84a493b87c502201fe88ea473264802f
	}

}
