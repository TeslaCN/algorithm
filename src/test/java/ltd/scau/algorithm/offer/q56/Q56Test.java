package ltd.scau.algorithm.offer.q56;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weijie Wu
 */
class Q56Test {

    @ParameterizedTest
    @MethodSource("source")
    void test(int[] a, int t1, int t2) {
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        Q56.FindNumsAppearOnce(a, num1, num2);
        assertEquals(t1, num1[0]);
        assertEquals(t2, num2[0]);
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8}, 3, 6)
        );
    }
}