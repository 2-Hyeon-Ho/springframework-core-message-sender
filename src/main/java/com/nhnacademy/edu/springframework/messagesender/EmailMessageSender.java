package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender {
    public EmailMessageSender() {
        System.out.println("+ EmailMessageSender is created");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email=" + user.getEmail() + " : " + message);
    }

    public void destroy() {
        System.out.println("+ EmailMessageSender cleanup");
    }
}
