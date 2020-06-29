package com.github.mathan.ObjectOrientedThinking.encapsulation;

public class Person {
    public String name;
    public int gender;
    private int age;

    public Person(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender==1?"Man":"Women";
    }

    public void work(){
        if(18 <=age && age<=50){
            System.out.println("Working very hard...!");
        }else {
            System.out.println("Can't work anymore");
        }
    }
}
