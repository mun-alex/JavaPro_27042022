package kz.bitlab.pro.lesson10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


//        fillArray(arrayList);
//        fillArray(linkedList);

//        addElToHead(arrayList);
//        addElToHead(linkedList);

        getElements(arrayList);
        getElements(linkedList);
    }

    public static void fillArray(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void addElToHead(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void getElements(List list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
