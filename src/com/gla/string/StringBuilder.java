package com.gla.string;
import java.util.*;
public class StringBuilder {
    static void main(String[] args){
        String str="Hello";
        //String str2=str + "world";
        //System.out.println(str2);

        //StringBuilder sb=new StringBuilder(str);
        //sb.append("World").append("Java");
        //System.out.println(sb);

        StringBuffer s=new StringBuffer(str);
        s.append("World").append("Java");
        System.out.println(s);


    }
}
