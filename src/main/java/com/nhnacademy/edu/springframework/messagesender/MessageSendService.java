package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {
    private MessageSender messageSender;
    //주석된 부분은 emailMessageSender와 smsMessageSender 둘다 Bean생성하기 위해 사용
//    private MessageSender emailMessageSender;
//    private MessageSender smsMessageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public MessageSendService() {

    }

    public void setEmailMessageSender(MessageSender messageSender) {
        System.out.println("-----------setMessageSender-----------");
        this.messageSender = messageSender;
    }

    //    public MessageSendService(MessageSender emailMessageSender, MessageSender smsMessageSender) {
//        this.emailMessageSender = emailMessageSender;
//        this.smsMessageSender = smsMessageSender;
//    }


    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }

//    public void doSendMessage(User user, String message) {
//        emailMessageSender.sendMessage(user, message);
//        smsMessageSender.sendMessage(user, message);
//    }
}
