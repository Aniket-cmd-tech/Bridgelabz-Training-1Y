package com.gla.regular_expression;
import java.util.*;
import java.util.regex.*;
public class CurrencyValues {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(s);
        while (m.find()) System.out.print(m.group() + " ");
    }
}
