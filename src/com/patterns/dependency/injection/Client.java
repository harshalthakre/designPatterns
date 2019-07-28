package com.patterns.dependency.injection;

import com.patterns.dependency.injection.consumer.Consumer;
import com.patterns.dependency.injection.injectors.EmailServiceInjector;
import com.patterns.dependency.injection.injectors.MessageServiceInjector;
import com.patterns.dependency.injection.injectors.SmsServiceInjector;

/**
 * POINTS TO PONDER
 *
 * When to use Constructor based dependency injection or setter based dependency injection
 * is design based decision and depends on your requirements
 *
 * Dependency Injection in JAVA is way to achieve Inversion of Control (IOC)
 * in our application by "moving Object based binding from compile time to runtime"
 *
 * We can achieve IOC through Factory Pattern , Template Method Design Pattern , Strategy Pattern & Service Locator Pattern too
 *
 *
 * Spring Dependency Injection facilitate the process of dependency injection through use of
 * JAVA REFLECTION API
 * JAVA ANNOTATIONS
 *
 * All we need is to annotate the field , constructor , or setter method and configure them in configuration xml files or classes*/
public class Client {
    public static void main(String[] args) {
        String msg="Hi Harshal";
        String email="harshalthakre.07@gmail.com";
        String phone="8308214797";

        MessageServiceInjector injector=null;
        Consumer app=null;

        // send email
        injector=new EmailServiceInjector();
        app=injector.getConsumer();
        app.processMessage(msg,email);

        // send sms
        injector=new SmsServiceInjector();
        app=injector.getConsumer();
        app.processMessage(msg,phone);
    }
}
