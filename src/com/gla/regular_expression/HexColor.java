package com.gla.regular_expression;
import java.util.*;
public class HexColor {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.matches("^#[0-9A-Fa-f]{6}$")?"Valid":"Invalid");
    }

}
