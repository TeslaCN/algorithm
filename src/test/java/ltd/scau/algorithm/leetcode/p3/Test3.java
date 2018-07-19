package ltd.scau.algorithm.leetcode.p3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Weijie Wu
 */
public class Test3 {

    private Problem3 s = new Problem3();

    @ParameterizedTest
    @CsvSource({
            "abcabcbb,3",
            "bbbbb,1",
            "pwwkew,3",
            "pwwkewrk,4",
    })
    public void test(String str, int length) {
        assertEquals(length, s.lengthOfLongestSubstring(str));
    }

}
