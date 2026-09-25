package com.codeWithOmar.store;


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

    public void placeOrder() {
        paymentService.processPayment(10);

    }


}
