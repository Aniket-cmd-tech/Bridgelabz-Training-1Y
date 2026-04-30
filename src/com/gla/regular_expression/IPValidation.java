package com.gla.regular_expression;
import java.util.*;
//runs from range 0-255
public class IPValidation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.)){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$") ? "Valid" : "Invalid");
    }
}
