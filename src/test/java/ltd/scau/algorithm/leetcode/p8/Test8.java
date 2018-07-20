package ltd.scau.algorithm.leetcode.p8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Weijie Wu
 */
public class Test8 {

    private Problem8 p = new Problem8();

    @ParameterizedTest
    @CsvSource({
            "-91283472332,-2147483648",
            "words and 987,0",
            "4193 with words,4193",
            "'   -42',-42",
            "42,42",
            "'',0",
            "+3,3",
            "2147483648,2147483647",
            "2147483646,2147483646",
            "-2147483649,-2147483648",
    })
    public void test(String s, int expected) {
        Assertions.assertEquals(expected, p.myAtoi(s));
    }
}
