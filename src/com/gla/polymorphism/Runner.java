package com.gla.polymorphism;

public class Runner {
    static void main(String[] args) {
        Calculator c1= new Calculator();
        int sum1=c1.add(11,22);
        System.out.println(sum1);
        double sum2=c1.add(11.22,12.33);
        System.out.println(sum2);
        String sum3=c1.add("hello", "world");
        System.out.println(sum3);

    }
}
