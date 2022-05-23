package kz.bitlab.pro.lesson10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
//        System.out.println(hashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(7);
//        System.out.println(treeSet);

        Set<String> names = new TreeSet<>();
        names.add("Shyryn");
        names.add("Azamat");
        names.add("Rahat");
        names.add("Batyrhan");
        names.add("Zarina");
        names.add("Aidar");

        names.remove("Azamat");
        System.out.println(names);

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);

        //union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        //intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //substruct
        Set<Integer> substruct = new HashSet<>(set2);
        substruct.removeAll(set1);
        System.out.println(substruct);
    }
}
