package ltd.scau.algorithm.offer.q25;

/**
 * @author Weijie Wu
 * <p>
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Q25 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val + (next != null ? " -> " + next : "");
        }
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list1.val > list2.val) {
            ListNode forSwap = list1;
            list1 = list2;
            list2 = forSwap;
        }

        ListNode pioneer = list1, successor = list1.next, current = list2;

        while (current != null) {
            ListNode c = current;
            if (successor == null) {
                current = current.next;
                pioneer.next = c;
                pioneer = c;
                c.next = successor;
            } else if (c.val <= successor.val) {
                current = current.next;
                pioneer.next = c;
                c.next = successor;
                pioneer = pioneer.next;
            } else {
                successor = successor.next;
                pioneer = pioneer.next;
            }
        }


        return list1;
    }

    public ListNode mergeRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode head = null;
        if (list1.val <= list2.val) {
            head = list1;
            head.next = mergeRecursive(list1.next, list2);
        } else {
            head = list2;
            head.next = mergeRecursive(list1, list2.next);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = l1.next = new ListNode(3);
        ListNode l3 = l2.next = new ListNode(5);

        ListNode l4 = new ListNode(2);
        ListNode l5 = l4.next = new ListNode(4);
        ListNode l6 = l5.next = new ListNode(6);

        Q25 q = new Q25();
        System.out.println(l1);
        System.out.println(l4);
//        System.out.println(q.merge(l1, l4));
        System.out.println(q.mergeRecursive(l1, l4));

    }

}
