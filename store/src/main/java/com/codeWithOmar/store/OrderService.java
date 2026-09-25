package com.codeWithOmar.store;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {


    private PaymentService paymentService;


    public OrderService(PaymentService paymentService) {

        this.paymentService = paymentService;
        System.out.println("Order service created");
    }

    @PostConstruct
    public void init() {

        System.out.println("Order service post construct");
    }

    @PreDestroy
    public void cleanup () {
        System.out.println("Order service cleanup");
    }

    public void placeOrder() {
        paymentService.processPayment(10);

    }


}
