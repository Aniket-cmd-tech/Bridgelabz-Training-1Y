package com.gla.revesion;
import java.util.*;
import java.util.*;
public class Mobile {
    String b;
    String c;
    String OS;
    String mo;
    double p;

    void display(){
        System.out.println("Brand :"+b);
        System.out.println("Color :"+c);
        System.out.println("OS :"+OS);
        System.out.println("Price :"+p);
        System.out.println("Model :"+mo);
    }

    static void main(String[] args) {
        Mobile m=new Mobile();
        m.b="Samsung";
        m.c="Z Black";
        m.OS="One UI";
        m.p=139999.99;
        m.mo="S26 Ultra";
        m.display();
    }

}
