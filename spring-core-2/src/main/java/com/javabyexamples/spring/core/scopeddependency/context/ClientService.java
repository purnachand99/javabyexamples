package com.javabyexamples.spring.core.scopeddependency.context;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ClientService {

    private final ApplicationContext context;

    public ClientService(ApplicationContext context) {
        this.context = context;
    }

    public void doWork() {
        final Timer timer = context.getBean(Timer.class);
        timer.start();
        timer.stop();
    }
}
