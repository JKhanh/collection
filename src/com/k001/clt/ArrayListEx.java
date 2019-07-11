package com.k001.clt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<String>();
        ArrayList<String> listB = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("How many element do you want to add to list: ");
        int total = input.nextInt();
        input.nextLine();
        for(int i = 0; i < total; i++) listA.add(input.nextLine());
        System.out.println("List A contain: ");
        Iterator<String> itr =  listA.iterator();
        while(itr.hasNext()) System.out.println(itr.next());
        System.out.println("Copying list A to list B");
        listB.addAll(listA);
        for(String obj:listB) System.out.println(obj);
        System.out.print("Add new element to list B: ");
        listB.add(input.nextLine());
        System.out.println("Delete all element appear in both list A and B!");
        listB.removeAll(listA);
        for(String obj:listB) System.out.println(obj);
    }
}
