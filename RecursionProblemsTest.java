import org.junit.Test;
import static org.junit.Assert.*;

public class RecursionProblemsTest {

    @Test
    public void testCount8() {
        assertEquals(1, RecursionProblems.count8(8));
        assertEquals(2, RecursionProblems.count8(818));
        assertEquals(4, RecursionProblems.count8(8818));
        assertEquals(0, RecursionProblems.count8(123));
        assertEquals(3, RecursionProblems.count8(888));
    }

    @Test
    public void testCountHi() {
        assertEquals(1, RecursionProblems.countHi("xxhixx"));
        assertEquals(2, RecursionProblems.countHi("xhixhix"));
        assertEquals(1, RecursionProblems.countHi("hi"));
        assertEquals(0, RecursionProblems.countHi("hello"));
        assertEquals(3, RecursionProblems.countHi("hihihi"));
    }

    @Test
    public void testCountHi2() {
        assertEquals(1, RecursionProblems.countHi2("ahixhi"));
        assertEquals(2, RecursionProblems.countHi2("ahibhi"));
        assertEquals(0, RecursionProblems.countHi2("xhixhi"));
        assertEquals(1, RecursionProblems.countHi2("hixhi"));
        assertEquals(0, RecursionProblems.countHi2("xhi"));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, RecursionProblems.strCount("catcowcat", "cat"));
        assertEquals(1, RecursionProblems.strCount("catcowcat", "cow"));
        assertEquals(0, RecursionProblems.strCount("catcowcat", "dog"));
        assertEquals(3, RecursionProblems.strCount("aaaaa", "aa"));
        assertEquals(1, RecursionProblems.strCount("xxcatxcatx", "cat"));
    }

    @Test
    public void testStringClean() {
        assertEquals("yza", RecursionProblems.stringClean("yyzzza"));
        assertEquals("abcd", RecursionProblems.stringClean("abbbcdd"));
        assertEquals("Helo", RecursionProblems.stringClean("Hello"));
        assertEquals("abc", RecursionProblems.stringClean("aabbcc"));
        assertEquals("a", RecursionProblems.stringClean("aaaaaa"));
    }
}