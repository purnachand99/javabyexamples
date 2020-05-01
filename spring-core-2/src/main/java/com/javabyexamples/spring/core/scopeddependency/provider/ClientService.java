package com.javabyexamples.spring.core.scopeddependency.provider;

import javax.inject.Provider;
import org.springframework.stereotype.Component;

@Component
public class ClientService {

    private final Provider<Timer> timerProvider;

    public ClientService(Provider<Timer> timerProvider) {
        this.timerProvider = timerProvider;
    }

    public void doWork() {
        final Timer timer = timerProvider.get();
        timer.start();
        timer.stop();
    }
}
