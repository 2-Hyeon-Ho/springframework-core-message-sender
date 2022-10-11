package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        //new MessageSendService(new SmsMessageSender().doSend)
        Main main = new Main();
        User user = new User("abc123", "1234");
        main.sendSmsMessage(user, "안녕하세요");
    }

    private void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to" + user + " : " + message);
    }

    private void sendEmailMessage(User user, String message) {
        System.out.println("Email Message Sent to" + user + " : " + message);
    }
}