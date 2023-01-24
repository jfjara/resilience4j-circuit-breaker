package com.jfjara.resilienceservice.infrastructure.scheduler;

import com.jfjara.resilienceservice.application.usecase.ports.GetMessageUseCase;
import com.jfjara.resilienceservice.domain.ports.JobRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobMessageRepository implements JobRepository {

    @Autowired
    private GetMessageUseCase getMessageUseCase;

    @Scheduled(cron = "*/5 * * * * *")

    @Override
    public void execute() {
        var result = getMessageUseCase.execute();
        System.out.println(result);
    }


}
