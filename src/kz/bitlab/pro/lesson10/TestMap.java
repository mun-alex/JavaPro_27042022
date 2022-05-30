package kz.bitlab.pro.lesson10;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> students = new TreeMap<>();
        students.put(6, null);
        students.put(2, "Aidar");
        students.put(5, "Zarina");
        students.put(4, "Shyryn");
        students.put(3, "Rahat");
        students.put(1, "Azamat");
        System.out.println(students);
        students.replace(2, "Ivan");
        System.out.println(students);

        List<String> kz = new ArrayList<>();
        kz.add("Karaganda");
        kz.add("Pavlodar");
        kz.add("Kokshetau");

        List<String> usa = new ArrayList<>();
        usa.add("Chicago");
        usa.add("Texas");
        usa.add("New-York");

        Map<String, List<String>> countries = new LinkedHashMap<>();
        countries.put("Kazakhstan", kz);
        countries.put("USA", usa);
        System.out.println(countries);

        for (Map.Entry<String, List<String>> pair : countries.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
