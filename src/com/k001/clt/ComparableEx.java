package com.k001.clt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<Human>();

        list.add(new Human("Anh", 16, "Vietnam"));
        list.add(new Human("OmPhanLaoRaBien", 16, "Laos"));
        list.add(new Human("Do", 30, "Vietnam"));
        list.add(new Human("Steve", 18, "England"));
        System.out.println("Huamn list before sort: ");
        for(Human human : list) System.out.println(human.toString());

        Collections.sort(list);

        System.out.println("Human list after sort: ");
        for(Human human : list) System.out.println(human.toString());
    }
}
