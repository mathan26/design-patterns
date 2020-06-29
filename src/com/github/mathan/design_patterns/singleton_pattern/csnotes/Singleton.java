package com.github.mathan.design_patterns.singleton_pattern.csnotes;
//Slacker-thread unsafe
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){

    }

    public static Singleton getUniqueInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new Singleton();
        }
        return uniqueInstance;
    }

}
