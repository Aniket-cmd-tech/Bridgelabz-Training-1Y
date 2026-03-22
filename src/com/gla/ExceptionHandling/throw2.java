package com.gla.ExceptionHandling;

public class throw2 {
    static void ageChecker(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Invalid age for voting");
        }
        System.out.println("valid Age");
    }
    static void main(String[] args) {
        ageChecker(100);
    }
}
