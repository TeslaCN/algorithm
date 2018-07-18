package ltd.scau.algorithm.leetcode.p3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Weijie Wu
 */
public class SolutionTest {

    private Solution s = new Solution();

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
