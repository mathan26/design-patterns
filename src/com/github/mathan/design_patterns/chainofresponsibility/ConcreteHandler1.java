package com.github.mathan.design_patterns.chainofresponsibility;

public class ConcreteHandler1  extends Handler{

    public ConcreteHandler1(Handler sucessor) {
        super(sucessor);
    }

    @Override
    protected void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE1){
            System.out.println(request.getName()+ " is handle by ConcreteHandler1");
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
