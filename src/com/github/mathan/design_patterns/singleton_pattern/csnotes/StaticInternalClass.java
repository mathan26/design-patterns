package com.github.mathan.design_patterns.singleton_pattern.csnotes;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticInternalClass {

   private StaticInternalClass(){

    }

    private static  class SingletonHolder{
       private static final StaticInternalClass INSTANCE = new StaticInternalClass();
    }

    public static StaticInternalClass getInstance(){
       return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(20);
        for (int i = 0; i <20 ; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(StaticInternalClass.getInstance().hashCode());
                }
            });
        }
        executorService.shutdown();
    }

}
