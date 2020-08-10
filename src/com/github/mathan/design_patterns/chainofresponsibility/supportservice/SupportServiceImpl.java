package com.github.mathan.design_patterns.chainofresponsibility.supportservice;

public class SupportServiceImpl implements SupportService{
    private SupportService  handler = null;

    public SupportService getHandler() {
        return handler;
    }

    public void setHandler(SupportService handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(ServiceRequest request) {
        handler.handleRequest(request);
    }
}
