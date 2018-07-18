package ltd.scau.algorithm.leetcode.p4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Weijie Wu
 */
public class SolutionTest {

    private Solution s = new Solution();

    @ParameterizedTest
    @MethodSource("getTestCase")
    public void test(List<Integer> list1, List<Integer> list2, double expected) {
        int[] nums1 = new int[list1.size()];
        int[] nums2 = new int[list2.size()];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = list1.get(i);
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = list2.get(i);
        }
        Assertions.assertEquals(expected, s.findMedianSortedArrays(nums1, nums2));
    }

    static Stream<Arguments> getTestCase() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2), Arrays.asList(3, 4), 2.5),
                Arguments.of(Arrays.asList(1, 3), Arrays.asList(2), 2.0),
                Arguments.of(Arrays.asList(1, 3, 6, 8), Arrays.asList(2, 3, 11, 17), 4.5),
                Arguments.of(Arrays.asList(1, 3, 4, 6, 8, 9), Arrays.asList(2, 3, 11, 17, 21), 6),
                Arguments.of(Arrays.asList(1, 3, 4, 6, 8, 9), Arrays.asList(2, 3, 11, 14, 17, 21), 7),
                Arguments.of(Arrays.asList(1), Arrays.asList(), 1),
                Arguments.of(Arrays.asList(1), Arrays.asList(1), 1),
                Arguments.of(Arrays.asList(1), Arrays.asList(2), 1.5),
                Arguments.of(Arrays.asList(1), Arrays.asList(2, 3, 4), 2.5),
                Arguments.of(Arrays.asList(1000001), Arrays.asList(1000000), 1000000.5),
                Arguments.of(Arrays.asList(2), Arrays.asList(1, 3, 4), 2.5),
                Arguments.of(Arrays.asList(3), Arrays.asList(1, 2, 4), 2.5),
                Arguments.of(Arrays.asList(), Arrays.asList(2, 3), 2.5),
                Arguments.of(Arrays.asList(1, 2), Arrays.asList(1, 2, 3), 2)
        );
    }
}
