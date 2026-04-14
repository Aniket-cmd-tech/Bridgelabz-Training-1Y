package com.gla.collection;
import java.util.*;
public class HashMapExample {
    static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("OM",14);
        map.put("Chirag",67);
        map.put("Prabal",57);
        map.put("Mayank",49);
        map.put("KEY",88);
        map.put("KEY",99);
        System.out.println(map);
        System.out.println(map.get("OM"));
        System.out.println(map.containsKey("OM"));
        System.out.println(map.remove("Mayank"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());
        for(String key:map.keySet()){
            System.out.print(" "+map.get(key));
        }
    }
}
