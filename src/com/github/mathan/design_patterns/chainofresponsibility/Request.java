package com.github.mathan.design_patterns.chainofresponsibility;

public class Request {
    private RequestType type;
    private  String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
