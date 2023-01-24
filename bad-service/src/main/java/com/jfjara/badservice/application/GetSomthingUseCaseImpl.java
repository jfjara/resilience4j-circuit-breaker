package com.jfjara.badservice.application;

import com.jfjara.badservice.application.ports.GetSomethingUseCase;

import java.util.Optional;

public class GetSomthingUseCaseImpl implements GetSomethingUseCase {

    @Override
    public Optional<String> execute() {
        return Optional.of("Bad Microservice is UP. It's not that bad");
    }

}
