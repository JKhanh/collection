package com.k001.clt;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList demo = new LinkedList();
        demo.add("A");
        demo.add("B");
        demo.add("C");
        demo.add("D");
        demo.addFirst("E");
        demo.add("F");
        demo.addLast("G");
        demo.add("H");
        demo.add(4,"I");
        System.out.println("Demo list contain: " + demo);
        System.out.println("Remove some element in demo list!");
        demo.remove("F");
        demo.remove(2);
        System.out.println("Demo list now have: " + demo);
        System.out.println("Remove first and last element!");
        demo.removeFirst();
        demo.removeLast();
        System.out.println("After: " + demo);
        System.out.println("Changing one element in demo list!");
        Object val = demo.get(4);
        demo.set(4, (String) val + " Changed");
        System.out.println("demo list: " + demo);
    }
}
