package com.github.mathan.design_patterns.proxy_pattern;

public class RealInternet implements Internet{

    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to"+serverhost);
    }
}
