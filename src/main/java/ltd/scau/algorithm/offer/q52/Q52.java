package ltd.scau.algorithm.offer.q52;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 *
 * @author Weijie Wu
 */
public class Q52 {

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int length1 = 0, length2 = 0;
        ListNode p = pHead1;
        while (p != null) {
            length1++;
            p = p.next;
        }
        p = pHead2;
        while (p != null) {
            length2++;
            p = p.next;
        }


        if (length1 < length2) {
            p = pHead1;
            pHead1 = pHead2;
            pHead2 = p;
            int temp = length1;
            length1 = length2;
            length2 = temp;
        }

        int before = length1 - length2;

        p = pHead1;
        ListNode other = pHead2;
        while (before > 0) {
            p = p.next;
            before--;
        }

        while (p != other) {
            p = p.next;
            other = other.next;
        }

        return p;
    }
}
