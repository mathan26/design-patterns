package com.github.mathan.design_patterns.oops;

public class WorkWithAnimals {
    public static void main(String[] args) {
        Dog fido= new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());
        fido.setWeight(-1);

        //Variable are passby value
        int someNumber=100;

        //Java is Pass by Value
        fido.changeValue(someNumber);
        System.out.println("After method call: "+someNumber);

        //But Object are reference the same address ,when you change it affect the actual values too.
        changeObjectName(fido);
        System.out.println("After changeObjectName methodCall");
        System.out.println(fido.getName());
    }

    private static void changeObjectName(Dog fido) {
        fido.setName("Marcus");
    }
}
