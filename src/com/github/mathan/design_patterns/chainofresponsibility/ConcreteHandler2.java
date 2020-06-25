package com.github.mathan.design_patterns.chainofresponsibility;

public class ConcreteHandler2 extends Handler{

    public ConcreteHandler2(Handler sucessor) {
        super(sucessor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE2){
            System.out.println(request.getName()+ " is handle by ConcreteHandler2");
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
