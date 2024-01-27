package pl.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NeedleExampleTests {
    @Test
    public void test1() {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        assertEquals("found the needle at position 3", Kata1.findNeedle(haystack1));
        assertEquals("found the needle at position 5", Kata1.findNeedle(haystack2));
        assertEquals("found the needle at position 30", Kata1.findNeedle(haystack3));
    }

    @Test
    public void test2() {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        assertEquals("found the needle at position 3", Kata2.findNeedle(haystack1));
        assertEquals("found the needle at position 5", Kata2.findNeedle(haystack2));
        assertEquals("found the needle at position 30", Kata2.findNeedle(haystack3));
    }
}