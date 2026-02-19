package com.gla.abstraction;

public interface Bike {
    String color = "Black";
    String company = "BMW";
    void engine();
    void speed();
}
class S1000RR implements Bike{

    @Override
    public void engine() {
        System.out.println("999 cc InLine 4 Cylinder Engine");
    }

    @Override
    public void speed() {
        System.out.println("303 km/h in India");

    }
}
class main{
    static void main(String[] args) {
        Bike b=new S1000RR();
        b.engine();
        b.speed();
    }
}