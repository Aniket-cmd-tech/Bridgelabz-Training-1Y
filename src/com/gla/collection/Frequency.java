package com.gla.collection;

import java.util.HashMap;

public class Frequency {
    static void main(String[] args) {
        int[] arr={2,4,1,3,2,6,4,9,8,7,6,7};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:arr){
           /* if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }*/
            map.put(val,map.getOrDefault(val,0)+1);
        }
        System.out.println(map);
    }
}
