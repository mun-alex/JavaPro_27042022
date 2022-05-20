package kz.bitlab.pro.lesson9;

import kz.bitlab.pro.lesson9.exceptions.IncorrectIinException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class TestCW {
    public static void main(String[] args) throws IOException, IncorrectIinException {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if (a != 0) System.out.println(10 / a);
//        else System.out.println("error");
//        System.out.println("program end");

//        int[] array = new int[5];
//        System.out.println(array[7]);

//        File file = new File("text.txt");
//        Scanner in = new Scanner(file);

//        try {
//            readFile(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("Файл не существует");
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("я выполнился");
//        }
//        System.out.println("Программа работает");

//        Scanner in = new Scanner(System.in);
//        if (!in.hasNextLong()) throw new IOException();
//        else {
//            Long iin = in.nextLong();
//            System.out.println(iin);
//        }

        Scanner in = new Scanner(System.in);
        if (in.hasNextLong()) {
            String iin = in.next();
            if (iin.length() != 12) {
                throw new IncorrectIinException("Введен некорректный ИИН");
            } else {
                System.out.println(iin);
            }
        } else throw new IncorrectIinException("Введен некорректный ИИН");

    }

    public static void readFile(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
    }
}
