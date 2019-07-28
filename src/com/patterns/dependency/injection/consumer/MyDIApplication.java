package com.patterns.dependency.injection.consumer;

import com.patterns.dependency.injection.services.MessageService;


/**
 * This Application class is just using the service
 * It does not initialize the service that leads to better "separation of concerns"
 *
 * use of service interface allow us to easily test the application by mocking the
 * MessageService and bind the services at runtime than compile time
 *
 * */
public class MyDIApplication implements Consumer {

    private MessageService messageService;

    public MyDIApplication(MessageService service){
        this.messageService=service;
    }

    @Override
    public void processMessage(String msg, String rec) {
        // do some message validation , manipulation logic

        this.messageService.sendMessage(msg,rec);
    }
}
