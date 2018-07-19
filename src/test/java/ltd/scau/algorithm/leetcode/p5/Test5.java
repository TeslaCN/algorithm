package ltd.scau.algorithm.leetcode.p5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Weijie Wu
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test5 {

    private Problem5 p = new Problem5();

    @ParameterizedTest
    @CsvSource({
            "babad,bab",
            "cbbd,bb",
            "'',''",
            "a,a",
            "babadada,adada",
    })
    public void test(String s, String expected) {
        Assertions.assertEquals(expected, p.longestPalindrome(s));
    }
}
