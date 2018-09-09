package ltd.scau.algorithm.offer.q45;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * @author Weijie Wu
 */
class Q45Test {

    Q45 q = new Q45();

    @ParameterizedTest
    @MethodSource("source")
    void test(int[] numbers) {
        System.out.println(q.PrintMinNumber(numbers));
    }

    static Stream<int[]> source() {
        return Stream.of(
                new int[]{3, 32, 321},
                new int[]{}
        );
    }

}