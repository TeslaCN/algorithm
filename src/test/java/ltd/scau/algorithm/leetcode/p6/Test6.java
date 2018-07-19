package ltd.scau.algorithm.leetcode.p6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author Weijie Wu
 */
public class Test6 {

    private Problem6 p = new Problem6();

    @ParameterizedTest
    @CsvSource({
            "PAYPALISHIRING,3,PAHNAPLSIIGYIR",
            "PAYPALISHIRING,4,PINALSIGYAHRPI",
            "A,1,A",
    })
    public void test(String s, int numRows, String expected) {
        Assertions.assertEquals(expected, p.convert(s, numRows));
    }
}
