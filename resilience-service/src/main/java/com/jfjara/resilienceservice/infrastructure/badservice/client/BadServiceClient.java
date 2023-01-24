package com.jfjara.resilienceservice.infrastructure.badservice.client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BadServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${badservice.host}")
    private String host;

    @Value("${badservice.endpoints.get-something}")
    private String getSomethingEndpoint;

    @CircuitBreaker(name = "CircuitBreakerService", fallbackMethod = "readMessageFallback")
    public String getMessage() {
        return restTemplate.getForObject(host + getSomethingEndpoint, String.class);
    }

    public String readMessageFallback(Exception exception) {
       return "Open Circuit. Error";
    }



}
