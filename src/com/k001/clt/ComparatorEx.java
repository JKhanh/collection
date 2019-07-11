package com.k001.clt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<Human>();

        list.add(new Human("Anh", 16, "Vietnam"));
        list.add(new Human("OmPhanLaoRaBien", 16, "Laos"));
        list.add(new Human("Do", 30, "Vietnam"));
        list.add(new Human("Steve", 18, "England"));
        System.out.println("Huamn list before sort: ");
        for(Human human : list) System.out.println(human.toString());
        System.out.println("Sort list by name!!!!!!");
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Human human : list) System.out.println(human.toString());
        System.out.println("Sort list by age!!!!!!");
        Collections.sort(list, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
        for(Human human : list) System.out.println(human.toString());
    }
}
