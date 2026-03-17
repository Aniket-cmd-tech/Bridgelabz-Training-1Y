package com.gla.ExceptionHandling;
public class Throw {
    public static void divide(int a,int b)throws ArithmeticException{
        int c = a/b;
        System.out.println(c);
    }

    static void main(String[] args) {
        try{
            divide(5,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
