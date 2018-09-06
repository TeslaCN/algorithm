package ltd.scau.algorithm.offer.q34;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

/**
 * @author Weijie Wu
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Q34Test {

    Q34 q = new Q34();

    Q34.TreeNode root = null;

    @BeforeAll
    void init() {
        root = new Q34.TreeNode(10);
        root.right = new Q34.TreeNode(12);
        root.left = new Q34.TreeNode(5);
        root.left.left = new Q34.TreeNode(9);
        root.left.right = new Q34.TreeNode(7);
    }

    @Test
    void findPath() {
        ArrayList<ArrayList<Integer>> path = q.FindPath(root, 22);
        System.out.println(path);
    }
}