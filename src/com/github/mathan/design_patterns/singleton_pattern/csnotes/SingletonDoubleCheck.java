package com.github.mathan.design_patterns.singleton_pattern.csnotes;
//Slacker-thread unsafe
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance=null; // volatile make sures the oreder of execution
     // variable shared amoong all the threads

    private SingletonDoubleCheck(){

    }

    public static SingletonDoubleCheck getInstance(){
     if(instance==null){
         synchronized (Singleton.class){
             if(instance==null) // Make sure for not instantiate two times!
                 instance=new SingletonDoubleCheck();
         }
     }
     return instance;
    }

}
