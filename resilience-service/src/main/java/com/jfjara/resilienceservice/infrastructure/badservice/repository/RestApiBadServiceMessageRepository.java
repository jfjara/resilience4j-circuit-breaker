package com.jfjara.resilienceservice.infrastructure.badservice.repository;

import com.jfjara.resilienceservice.domain.ports.MessageRepository;
import com.jfjara.resilienceservice.infrastructure.badservice.client.BadServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestApiBadServiceMessageRepository implements MessageRepository {

    @Autowired
    private BadServiceClient client;

    @Override
    public String getMessage() {
        return client.getMessage();
    }
}
