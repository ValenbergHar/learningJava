package com.simple;

import org.springframework.stereotype.Component;

@Component
public class MailService {
    public  void sendMail(){
        System.out.println("Mail is sent");
    }
}
