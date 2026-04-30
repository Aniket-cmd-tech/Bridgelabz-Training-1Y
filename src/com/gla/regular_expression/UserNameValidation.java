package com.gla.regular_expression;
import java.util.*;
public class UserNameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$") ? "Valid" : "Invalid");
    }
}
