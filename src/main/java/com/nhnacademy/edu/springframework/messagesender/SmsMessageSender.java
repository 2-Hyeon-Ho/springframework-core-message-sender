package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender {
    public SmsMessageSender() {
        System.out.println("+ SmsMessageSender is created");
    }

    public void init() {
        System.out.println("+ SmsMessageSender is initializing");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("PhoneNumber=" + user.getPhoneNumber() + " : " + message);
    }
}
