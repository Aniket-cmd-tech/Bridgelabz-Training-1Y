package com.gla.regular_expression;
import java.util.*;
public class SSN {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.matches("^\\d{3}-\\d{2}-\\d{4}$") ? "Valid" : "Invalid");
    }
}
