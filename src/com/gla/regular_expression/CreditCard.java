package com.gla.regular_expression;
import java.util.*;
public class CreditCard {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.matches("^4\\d{15}$")||s.matches("^5\\d{15}$")?"Valid":"Invalid");

   }
}
