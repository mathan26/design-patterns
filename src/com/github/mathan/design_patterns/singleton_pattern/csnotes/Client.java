package com.github.mathan.design_patterns.singleton_pattern.csnotes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20 ; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SingletonDoubleCheck.getInstance().hashCode());
                }
            });
        }
        executorService.shutdown();
    }
}

//SAMPLE OUTPUT
/*
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
902790269
 */