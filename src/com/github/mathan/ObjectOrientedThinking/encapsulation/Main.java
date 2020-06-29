package com.github.mathan.ObjectOrientedThinking.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person=new Person("Mathankumar",1,26);
        System.out.println(person.getName());
        System.out.println(person.getGender());
        person.work();
    }
}
