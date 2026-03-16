package com.gla.revesion;
import java.awt.*;
import java.util.*;
public class Car {
    String Color;
    String Brand;
    double price;
    String model;
    public Car(String col,String b,double p,String m){
      this.price=p;
      this.Brand=b;
      this.model=m;
      this.Color=col;
    }

    public Car() {

    }

    void printDetail(){
        System.out.println("Brand :"+Brand);
        System.out.println("Color :"+Color);
        System.out.println("Model :"+model);
        System.out.println("Price :"+price);


    }
}
 class defender extends Car{
    boolean offRoading;
     void printDetail(){
         boolean OffRoading = true;
         System.out.println("OffRoading"+OffRoading);
     }



     public defender(String col, String b, double p, String m,boolean offRoading) {
         super(col, b, p, m);

     }

 }

class   main{
    static void main(String[] args) {
        defender d=new defender("Black","defender",1.38,"hx",true);

        d.printDetail();
        }
}
