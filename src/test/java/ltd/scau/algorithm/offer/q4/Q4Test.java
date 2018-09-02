package ltd.scau.algorithm.offer.q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weijie Wu
 */
class Q4Test {

    Q4 q = new Q4();

    @Test
    void find() {
        int[][] a = new int[][]{
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15},
        };
        System.out.println(q.find(7, a));
        System.out.println(q.find(5, a));
    }
}