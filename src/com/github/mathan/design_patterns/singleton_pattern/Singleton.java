package com.github.mathan.design_patterns.singleton_pattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Singleton {
    public static Singleton firstInstance=null;
    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z"};

    private LinkedList<String> letterList=new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread=true;

    private Singleton(){

    }

    public List<String> getLetterList(){
        return firstInstance.letterList;
    }

    public static Singleton getInstance(){
        if(firstInstance==null){
            firstThread=false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (Singleton.class){
            if(firstInstance==null){
                firstInstance=new Singleton();
                Collections.shuffle(firstInstance.letterList);
            }
        }
        return firstInstance;
    }

    public LinkedList<String> getTiles(int howManyTitles){
        LinkedList<String> titlesToSend = new LinkedList<String>();
        for(int i=0;i<=howManyTitles;i++){
            titlesToSend.add(firstInstance.letterList.remove(0));
        }
        return titlesToSend;
    }

}
