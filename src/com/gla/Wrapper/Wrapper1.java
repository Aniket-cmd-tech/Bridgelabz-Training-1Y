package com.gla.Wrapper;
import java.util.ArrayList;
public class Wrapper1 {
    static void main(String[] args) {
        int a=10;

        Integer b=a;//Auto-boxing
        Integer s=new Integer(8);//boxing
        int k=s.intValue();//unboxing
        int x=b;//Auto-Unboxing
        Integer v=300;
        Integer n=300;
        System.out.println(v.equals(n));


    }
}
