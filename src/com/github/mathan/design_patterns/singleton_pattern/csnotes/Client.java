package com.github.mathan.design_patterns.singleton_pattern.csnotes;

public class Client extends Thread {
    public static void main(String[] args) {
        Client client= new Client();
        client.start();
    }

    public void run(){
        Singleton obj=Singleton.getUniqueInstance();
        System.out.println(obj.getClass().hashCode());
        Singleton obj1=Singleton.getUniqueInstance();
        System.out.println(obj1.getClass().hashCode());
        System.out.println("Thread called!");
    }
}
