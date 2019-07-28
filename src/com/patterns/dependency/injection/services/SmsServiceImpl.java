package com.patterns.dependency.injection.services;

public class SmsServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS is sent to : "+rec+" with Message: "+msg);
    }
}
