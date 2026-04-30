package com.gla.regular_expression;
import java.util.*;
public class LicensePlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.matches("^[A-Z]{2}[0-9]{4}$") ? "Valid" : "Invalid");
    }
}
