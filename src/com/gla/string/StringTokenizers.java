package com.gla.string;
import java.util.*;
public class StringTokenizers {
    static void main(String[] args) {
     String str="This is my dog";
     StringTokenizer st=new StringTokenizer(str);
     while(st.hasMoreTokens()){
         System.out.println(st.nextToken());
     }

    }
}
