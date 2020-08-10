package com.github.mathan.design_patterns.chainofresponsibility.supportservice;

public class Client {
    public static void main(String[] args) {
        SupportServiceImpl supportService = new SupportServiceImpl();
        FrontDeskSupport  frontDeskSupport = new FrontDeskSupport();
        SuperVisorSupport superVisorSupport = new SuperVisorSupport();
        ManagerSupport managerSupport =  new ManagerSupport();

        supportService.setHandler(frontDeskSupport);
        frontDeskSupport.setNext(superVisorSupport);
        superVisorSupport.setNext(managerSupport);

        ServiceRequest serviceRequest1 = new ServiceRequest();
        serviceRequest1.setServiceLevel(ServiceLevel.LEVEL_ONE);
        supportService.handleRequest(serviceRequest1);
        System.out.println(serviceRequest1.getConclusion());

        ServiceRequest serviceRequest2 = new ServiceRequest();
        serviceRequest2.setServiceLevel(ServiceLevel.LEVEL_TWO);
        supportService.handleRequest(serviceRequest2);
        System.out.println(serviceRequest2.getConclusion());


        ServiceRequest invalidRequest = new ServiceRequest();
        serviceRequest2.setServiceLevel(ServiceLevel.INVALID_REQUEST);
        supportService.handleRequest(invalidRequest);
        System.out.println(invalidRequest.getConclusion());
    }
}
