package pl.kata;

public class Kata1 {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if ("needle".equals(haystack[i])) {
                return "found the needle at position " + i;
            }
        }
        return "needle not found";
    }
}
