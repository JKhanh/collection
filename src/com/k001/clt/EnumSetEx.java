package com.k001.clt;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetEx {
    enum Universities{
        PTIT, HUST, NEU, VNU, HANU, HUA
    }

    public static void main(String[] args) {
        Set<Universities> HN = EnumSet.allOf(Universities.class);
        System.out.println("Universities in Hanoi is: " + HN);
        Set<Universities> haDongUnis = EnumSet.of(Universities.PTIT, Universities.HANU, Universities.HUA);
        Iterator<Universities> itr = haDongUnis.iterator();
        System.out.println("Universities in Ha Dong is: ");
        while(itr.hasNext()) System.out.println(itr.next());
    }
}
