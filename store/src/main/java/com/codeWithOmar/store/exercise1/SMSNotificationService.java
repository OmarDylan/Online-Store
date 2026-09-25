package com.codeWithOmar.store.exercise1;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService implements NotificationService {


    @Override
    public void send(String message) {
        System.out.println("SMS Notification Service: " + message);
    }
}
