package com.gla.Type_Casting;

class Car {
    void display() {
        System.out.println("Luxury");
    }
}
class Ghost extends Car{
    void type(){
        System.out.println("Handcrafted designs");
    }
}
class UpCasting{
    static void main(String[] args) {
        Car v= new Ghost();
        v.display();
    }
}




