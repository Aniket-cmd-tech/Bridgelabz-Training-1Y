package com.gla.string;
import java.util.*;
public class LC14 {

        public String longestCommonPrefix(String[] strs) {

            Arrays.sort(strs);
            String s1=strs[0];
            String s2=strs[strs.length-1];
            StringBuilder sb=new StringBuilder();
            int i=0;
            while(i<s1.length()&&i<s2.length()){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return sb.toString();
                } else {
                    char ch=s1.charAt(i);
                 //   sb.append(ch);
                }
                i++;
            }
            return sb.toString();
        }
    }

