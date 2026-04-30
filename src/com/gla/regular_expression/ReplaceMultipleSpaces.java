package com.gla.regular_expression;
import java.util.*;
import java.util.regex.*;
public class ReplaceMultipleSpaces {
   static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replaceAll("\\s+", " "));

    }
}
