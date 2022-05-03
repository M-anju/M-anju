package com.pluralsight;

import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hm=new HashMap<>();

        hm.put("1111", "abc");
        hm.put("2222","abc");
        hm.put("3333","xyz");
        System.out.println(hm.size());
        hm.replaceAll((k,v)-> v.toUpperCase());
        hm.forEach((k,v)-> System.out.println("Key is "+k+" and a Value is "+v));
    }
}
