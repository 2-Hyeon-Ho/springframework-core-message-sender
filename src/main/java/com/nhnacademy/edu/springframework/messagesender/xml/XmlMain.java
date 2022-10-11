package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        String location = "classpath:/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

        //emailMessageSender와 smsMessageSender의 Bean을 가져오고 메세지 출력
        /*MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
        MessageSender smsMessageSender = context.getBean("SmsMessageSender", MessageSender.class);

        emailMessageSender.sendMessage(new User("abc123", "010"), "hi");
        smsMessageSender.sendMessage(new User("abc12", "011"), "hello");*/

        User user = new User("abc", "010");
        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, "This is Message");
        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, "This is Message");

        System.out.println("-----------------------------------");
        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, "This is Message");
        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, "This is Message");

        context.close();
    }
}
