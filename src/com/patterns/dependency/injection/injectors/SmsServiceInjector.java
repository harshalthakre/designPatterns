package com.patterns.dependency.injection.injectors;

import com.patterns.dependency.injection.consumer.Consumer;
import com.patterns.dependency.injection.consumer.MyDIApplication;
import com.patterns.dependency.injection.services.SmsServiceImpl;

public class SmsServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SmsServiceImpl());
    }
}
