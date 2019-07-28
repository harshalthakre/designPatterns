package com.patterns.dependency.injection.injectors;

import com.patterns.dependency.injection.consumer.Consumer;

public interface MessageServiceInjector {

    public Consumer getConsumer();
}
