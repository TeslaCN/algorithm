package ltd.scau.algorithm.offer.q35;

/**
 * @author Weijie Wu
 * <p>
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Q35 {

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return "RandomListNode{" +
                    "label=" + label +
                    (next != null ? ", next=" + next.label : "") +
                    (random != null ? ", random=" + random.label : "") +
                    '}';
        }
    }

    public RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }

        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode newNode = new RandomListNode(node.label);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }

        node = pHead;
        while (node != null) {
            RandomListNode newRandomNext = node.random;
            node = node.next;
            if (newRandomNext != null) {
                node.random = newRandomNext.next;
            }
            node = node.next;
        }

        RandomListNode newHead = node = pHead.next;
        while (node.next != null) {
            node.next = node.next.next;
            node = node.next;
        }

        return newHead;
    }
}
