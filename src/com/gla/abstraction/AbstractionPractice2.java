package com.gla.abstraction;

import java.awt.*;

abstract class Car {
    abstract void name();
    void Wheel()
    {
        System.out.println("4 wheel");
    }
}
class color extends Car{

    @Override
    void name() {
        System.out.println("Red");
    }
}
class Passenger extends Car{

    @Override
    void name() {
        System.out.println(" Four");
    }
}
class Fav extends Car{

    @Override
    void name() {
        System.out.println("BMW");
    }
}
public class AbstractionPractice2 {
    static void main(String[] args) {
        color c1=new color();
        c1.name();
        Car c2=new Passenger();
        c2.name();
        c2.Wheel();
        Fav f1=new Fav();
        f1.name();
    }
}
