package com.gla.Inheritance;

public class Runner {
    static void main(String[] args) {
        Animal a1 = new Animal();
        a1.walk();
        System.out.println("----------------------------------------------");
        Dog d1 = new Dog();
        d1.walk();
        d1.sound();
        System.out.println("----------------------------------------------");
        puppy p1 = new puppy();
        p1.looks();
        p1.walk();
        p1.sound();
    }
}
