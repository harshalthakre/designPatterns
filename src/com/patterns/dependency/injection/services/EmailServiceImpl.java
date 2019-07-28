package com.patterns.dependency.injection.services;

public class EmailServiceImpl implements MessageService{
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Email sent to: "+rec+" with body : "+msg);
    }
}
