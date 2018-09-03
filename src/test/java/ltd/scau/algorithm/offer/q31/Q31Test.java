package ltd.scau.algorithm.offer.q31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weijie Wu
 */
class Q31Test {

    @Test
    void isPopOrder() {
        System.out.println(Q31.isPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
        System.out.println(Q31.isPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{4, 3, 5, 1, 2}));
        System.out.println(Q31.isPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}));
        System.out.println(Q31.isPopOrder(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 5, 4}));
    }
}