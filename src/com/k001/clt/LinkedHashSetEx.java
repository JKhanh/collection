package com.k001.clt;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String> demo = new LinkedHashSet<>();
        demo.add("B");
        demo.add("B");
        demo.add("A");
        demo.add("C");
        System.out.println("demo set : " + demo);
    }
}
