package com.epam.traits;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class Stam {
    public static void printStrings(String... strings) {
        Arrays.stream(strings).forEach(System.out::println);
    }
}
