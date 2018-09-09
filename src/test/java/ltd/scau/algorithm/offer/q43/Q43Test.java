package ltd.scau.algorithm.offer.q43;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weijie Wu
 */
class Q43Test {

    private Q43 q = new Q43();

    @ParameterizedTest
    @CsvSource({
            "10",
            "13",
            "100",
            "998",
            "21345",
    })
    void test(int n) {
        System.out.println(q.oneInRange(n));
    }

}