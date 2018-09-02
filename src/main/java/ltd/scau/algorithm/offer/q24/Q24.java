package ltd.scau.algorithm.offer.q24;

/**
 * @author Weijie Wu
 *
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Q24 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pioneer, current, successor;
        pioneer = null;
        current = head;
        while (current != null) {
            successor = current.next;
            current.next = pioneer;
            pioneer = current;
            current = successor;
        }
        return pioneer;
    }
}
