package kz.bitlab.pro.lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Lesson1 lesson1 = new Lesson1();
        int sum = lesson1.sum(a, b);

        System.out.println(sum);
        System.out.println(lesson1.sum(4, 25));
        System.out.println(lesson1.sum("Hello", "World"));

        OtherLesson otherLesson = new OtherLesson();
        System.out.println(otherLesson.multiply(5, 6));
        int c = in.nextInt();
        if (lesson1.exp2cw(a, b, c)) System.out.println("YES");
        else System.out.println("NO");
    }

    int sum(int a, int b) {
        return a + b;
    }

    String sum(String a, String b) {
        return a + " " + b;
    }

    /**
     * Напишите метод, который в аргументы принимает три натуральных числа a, b, c.
     * Определите, существует ли треугольник с такими сторонами.
     * Если треугольник существует, выведите строку YES, иначе выведите строку NO.
     * @param a
     * @param b
     * @param c
     * @return
     */
    boolean exp2cw ( int a, int b, int c){
        boolean isExist = false;
        if ((a + b > c) && (c + b > a) && (a + c > b))
            isExist = true;
        return isExist;
    }
}

class OtherLesson {
    public int multiply(int a, int b) {
        return a * b;
    }
}
