package com.jfjara.resilienceservice.infrastructure.springboot.config;

import com.jfjara.resilienceservice.application.usecase.GetMessageUseCaseImpl;
import com.jfjara.resilienceservice.application.usecase.ports.GetMessageUseCase;
import com.jfjara.resilienceservice.infrastructure.badservice.repository.RestApiBadServiceMessageRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public GetMessageUseCase getMessageUseCase(final RestApiBadServiceMessageRepository repository) {
        return new GetMessageUseCaseImpl(repository);
    }

}
