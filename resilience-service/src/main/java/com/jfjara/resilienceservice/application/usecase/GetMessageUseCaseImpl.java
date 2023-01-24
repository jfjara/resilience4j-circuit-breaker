package com.jfjara.resilienceservice.application.usecase;

import com.jfjara.resilienceservice.application.usecase.ports.GetMessageUseCase;
import com.jfjara.resilienceservice.domain.ports.MessageRepository;

public class GetMessageUseCaseImpl implements GetMessageUseCase {

    private final MessageRepository messageRepository;

    public GetMessageUseCaseImpl(final MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public String execute() {
        return messageRepository.getMessage();
    }
}
