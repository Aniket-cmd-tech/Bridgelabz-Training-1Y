package com.gla.Type_Casting;

class Vehicle {
    void display() {
        System.out.println("Sedan");
    }
}
class BMW extends Vehicle{
    void speed(){
        System.out.println("Super Car Killer Speed");
    }
}
class Main{
    static void main(String[] args) {
        Vehicle v= new BMW();
        BMW b=(BMW)v;
        v.display();
        b.speed();


    }
}


