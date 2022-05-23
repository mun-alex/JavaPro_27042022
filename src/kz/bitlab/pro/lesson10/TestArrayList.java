package kz.bitlab.pro.lesson10;

import kz.bitlab.pro.lesson5.Notebook;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.remove(2);
        System.out.println(arrayList);

        Notebook notebook1 = new Notebook("Apple", "Mac",324354);
        Notebook notebook2 = new Notebook("Asus", "Mac",324354);
        Notebook notebook3 = new Notebook("Lenovo", "Mac",324354);

        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);

        for(Notebook notebook: notebooks) {
            System.out.println(notebook.getBrand());
        }

        notebooks.remove(notebook2);
        for(Notebook notebook: notebooks) {
            System.out.println(notebook.getBrand());
        }

        List<Integer> arrayList1 = new ArrayList<>(arrayList);

    }
}
