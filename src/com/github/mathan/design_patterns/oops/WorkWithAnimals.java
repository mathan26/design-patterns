package com.github.mathan.design_patterns.oops;

public class WorkWithAnimals {

    int instancneVaribale=0;
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

        //Polymorphism
        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("doggy says "+doggy.getSound());
        System.out.println("kitty says "+kitty.getSound());

        //Array of object

        Animal[] animals=new Animal[2];
        animals[0]=doggy;
        animals[1]=kitty;
        //Array of object
        System.out.println();
        System.out.println("doggy says "+animals[0].getSound());
        System.out.println("kitty says "+animals[1].getSound());

        //Cannot call subclass new method,because it is an Parent class instance
        //CE ERROR: Cannot resolve method 'digHole' in 'Animal'
        //doggy.digHole();

        //In order to call need to do type casting
        System.out.println();
        System.out.println("type casting: "+  ((Dog)doggy).getSound() );

        //Non-static field 'instancneVaribale' cannot be referenced from a static context
        //System.out.println(instancneVaribale);

        //Non-static method 'sayHello()' cannot be referenced from a static context
        //sayHello();]

        //Cannot call private method of a class from outside
        //fido.bePrivate();

        //but we can call from the public method of the class
        fido.callPrivateMethod();

        //Abstract class example

        System.out.println("doggy life time");
        doggy.getLifeTime();
        System.out.println("Kitty life time");
        kitty.getLifeTime();

        Living monkeyObj=new Monkey();
        monkeyObj.setName("king Hong");
        System.out.println(monkeyObj.getName());
    }

    private static void changeObjectName(Dog fido) {
        fido.setName("Marcus");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
