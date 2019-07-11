package com.k001.clt;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> demo = new HashSet<String>();
        demo.add("A");
        demo.add("B");
        demo.add("C");
        demo.add("C");
        System.out.println("demo set: " + demo);
    }
}
