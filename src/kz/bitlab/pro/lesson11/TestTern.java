package kz.bitlab.pro.lesson11;

public class TestTern {
    public static void main(String[] args) {
        String str = "hello";
        int number = 0;

//        if (str.equals("hello")) number = 5;
//        else number = 1;

        number = str.equals("hello")?5:1; //тернарный оператор

        System.out.println(number);
    }
}
