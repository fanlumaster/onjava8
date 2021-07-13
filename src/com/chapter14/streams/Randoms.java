package com.chapter14.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);

        IntStream sorted = new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted();
        System.out.println(sorted.toString());
    }
}
