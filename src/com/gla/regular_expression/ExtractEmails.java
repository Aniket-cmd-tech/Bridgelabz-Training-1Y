package com.gla.regular_expression;
import java.util.*;
import java.util.regex.*;
public class ExtractEmails {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Matcher m=Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}").matcher(s);
        while(m.find())
            System.out.println(m.group());
    }
}
