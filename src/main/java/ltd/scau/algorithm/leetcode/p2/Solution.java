package ltd.scau.algorithm.leetcode.p2;

/**
 * @author Weijie Wu
 *
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode node = head;
        boolean c = false;
        while (l1 != null || l2 != null) {
            int val1 = 0, val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int result = val1 + val2 + (c ? 1 : 0);
            c = result > 9;
            result %= 10;
            if (head == null) {
                head = new ListNode(result);
                node = head;
            } else {
                node.next = new ListNode(result);
                node = node.next;
            }
        }
        if (c) {
            node.next = new ListNode(1);
        }
        return head;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
    }
}
