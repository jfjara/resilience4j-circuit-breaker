package com.jfjara.badservice.infrastructure.springboot.config;

import com.jfjara.badservice.application.GetSomthingUseCaseImpl;
import com.jfjara.badservice.application.ports.GetSomethingUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetSomethingUseCase getSomethingUseCase() {
        return new GetSomthingUseCaseImpl();
    }
}
