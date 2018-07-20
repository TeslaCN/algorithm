package ltd.scau.algorithm.leetcode.p7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Weijie Wu
 */
public class Test7 {

    private Problem7 p = new Problem7();

    @ParameterizedTest
    @CsvSource({
            "123,321",
            "-123,-321",
            "120,21",
            "1534236469,0",
            "-2147483648,0",
    })
    public void test(int x, int expected) {
        Assertions.assertEquals(expected, p.reverse(x));
    }
}
