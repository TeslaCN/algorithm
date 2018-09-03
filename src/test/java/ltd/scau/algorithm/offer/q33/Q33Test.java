package ltd.scau.algorithm.offer.q33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weijie Wu
 */
class Q33Test {

    @Test
    void verifySquenceOfBST() {
        System.out.println(Q33.verifySquenceOfBST(new int[]{5, 7, 6, 9, 11, 10, 8}));
        System.out.println(Q33.verifySquenceOfBST(new int[]{7, 4, 6, 5}));
    }
}