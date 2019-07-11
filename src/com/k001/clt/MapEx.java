package com.k001.clt;

import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> demo = new TreeMap<String, Integer>();
        demo.put("A", 10);
        demo.put("B", 20);
        demo.put("C", 54);
        demo.put("D", 6);
        demo.put("E", 94);
        System.out.println("Demo map before: " + demo);
        Integer number = demo.get("D");
        demo.put("D", number*10+4);
        System.out.println("Demo map after: " + demo);
    }
}
