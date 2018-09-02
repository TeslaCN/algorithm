package ltd.scau.algorithm.offer.q22;

/**
 * @author Weijie Wu
 *
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Q22 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode findkthToTail(ListNode head, int k) {
        if (k < 1) {
            return null;
        }
        if (head == null) {
            return null;
        }
        ListNode pre, su;
        pre = su = head;
        for (int i = 0; i < k; i++) {
            if (su == null) {
                return null;
            }
            su = su.next;
        }
        while (su != null) {
            pre = pre.next;
            su = su.next;
        }
        return pre;
    }
}
