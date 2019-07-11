package com.k001.clt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {
        List<Human1> list = new ArrayList<Human1>();

        list.add(new Human1("Anh", 16, "Vietnam"));
        list.add(new Human1("OmPhanLaoRaBien", 16, "Laos"));
        list.add(new Human1("Do", 30, "Vietnam"));
        list.add(new Human1("Steve", 18, "England"));
        System.out.println("Huamn list before sort: ");
        for(Human1 human : list) System.out.println(human.toString());
        System.out.println("Sort list by name!!!!!!");
        Collections.sort(list, new Comparator<Human1>() {
            @Override
            public int compare(Human1 o1, Human1 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Human1 human : list) System.out.println(human.toString());
        System.out.println("Sort list by age!!!!!!");
        Collections.sort(list, new Comparator<Human1>() {
            @Override
            public int compare(Human1 o1, Human1 o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
        for(Human1 human : list) System.out.println(human.toString());
    }
}
