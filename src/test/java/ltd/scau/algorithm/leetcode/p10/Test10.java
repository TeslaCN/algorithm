package ltd.scau.algorithm.leetcode.p10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Weijie Wu
 */
public class Test10 {

    private Problem10 p = new Problem10();

    @ParameterizedTest
    @CsvSource({
            "aa,a*,true",
            "aa,a,false",

    })
    public void test(String s, String p, boolean expected) {
        Assertions.assertEquals(expected, this.p.isMatch(s, p));
    }
}
