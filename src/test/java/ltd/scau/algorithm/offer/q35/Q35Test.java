package ltd.scau.algorithm.offer.q35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weijie Wu
 */
class Q35Test {

    @Test
    void cloneTest() {
        Q35.RandomListNode[] n = new Q35.RandomListNode[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = new Q35.RandomListNode(i + 1);
        }
        for (int i = 0; i < n.length - 1; i++) {
            n[i].next = n[i + 1];
        }
        n[0].random = n[2];
        n[1].random = n[4];
        n[3].random = n[1];

        Q35 q = new Q35();
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
        Q35.RandomListNode clone = q.clone(n[0]);
        while (clone != null) {
            System.out.print(clone + " ");
            clone = clone.next;
        }
    }

}