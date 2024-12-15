package org.example.demo;

public class ServiceC {
    private final String requestId;

    public ServiceC(RequestIdGenerator requestIdGenerator) {
        this.requestId = requestIdGenerator.generateRequestId();
    }

    public String getRequestId() {
        return requestId;
    }
}
