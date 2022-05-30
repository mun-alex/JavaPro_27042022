package kz.bitlab.pro.lesson12;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
//        int count = 0;
//        int[] numbers = new int[]{4, -5, 3, -9, 23, 12, -34};
//        for(int x : numbers) {
//            if (x < 0) count++;
//        }
//        System.out.println(count);

        long count = Stream.of(4, -5, 3, -9, 23, 12, -34).filter(n -> n < 0).count();
        System.out.println(count);

        Stream.of(4, -5, 3, -9, 23, 12, -34).map(n -> n * 10).forEach(n -> System.out.print(n + " "));
    }
}
