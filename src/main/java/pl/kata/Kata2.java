package pl.kata;

import java.util.Arrays;

public class Kata2 {
    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
