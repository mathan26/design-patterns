package com.github.mathan.design_patterns.chainofresponsibility.supportservice;

public class ManagerSupport implements SupportService{

    private SupportService  next = null;

    public SupportService getNext() {
        return next;
    }

    public void setNext(SupportService next) {
        this.next = next;
    }

    @Override
    public void handleRequest(ServiceRequest service) {
        if(service.getServiceLevel() == ServiceLevel.LEVEL_THREE)
        {
            service.setConclusion("Manger solved level Three reuqest !!");
        }
        else
        {
            if(next != null){
                next.handleRequest(service);
            }
            else
            {
                throw new IllegalArgumentException("No handler found for :: " + service.getServiceLevel());
            }
        }
    }
}
