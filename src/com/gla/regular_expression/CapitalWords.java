package com.gla.regular_expression;
import java.util.Scanner;
import  java.util.regex.*;
public class CapitalWords {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Matcher m=Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(s);
        while(m.find())System.out.print(m.group()+" ");
    }
}
