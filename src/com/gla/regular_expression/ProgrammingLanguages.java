package com.gla.regular_expression;
import java.util.*;
import java.util.regex.*;
public class ProgrammingLanguages {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(s);
        while (m.find()) System.out.print(m.group() + " ");
    }
}
