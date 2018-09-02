package ltd.scau.algorithm.offer.q6;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @author Weijie Wu
 *
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Q6 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        while (listNode != null) {
            deque.addFirst(listNode.val);
            listNode = listNode.next;
        }

        return new ArrayList<>(deque);
    }
}
