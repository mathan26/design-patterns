package com.github.mathan.design_patterns.singleton_pattern.csnotes;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Ⅰ Lazy man-thread unsafe
public class LazyManThreadUnsafe {
    public static void main(String[] args) {
        ExecutorService  executorService =Executors.newFixedThreadPool(20);

        for (int i = 0; i <20 ; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getUniqueInstance().hashCode());
                }
            });
        }
        executorService.shutdown();

    }
}

//SAMPLE OUTPUT
/*
        1742432453
        729372058
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1193796790
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453
        1742432453*/
