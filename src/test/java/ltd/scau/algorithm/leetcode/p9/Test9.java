package ltd.scau.algorithm.leetcode.p9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Weijie Wu
 */
public class Test9 {

    private Problem9 p = new Problem9();

    @ParameterizedTest
    @CsvSource({
           "121,true",
           "-121,false",
           "10,false",
    })
    public void test(int x, boolean expected) {
        Assertions.assertEquals(expected, p.isPalindrome(x));
    }
}
