package ltd.scau.algorithm.offer.q30;

/**
 * @author Weijie Wu
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Q30 {

    private int[] objects = new int[Byte.MAX_VALUE];

    private int[] mins = new int[Byte.MAX_VALUE];

    {
        for (int i = 0; i < mins.length; i++) {
            mins[i] = Integer.MAX_VALUE;
        }
    }

    private int current = 0;

    public void push(int node) {
        objects[current] = node;
        int pre = current - 1;
        pre = pre < 0 ? 0 : pre;
        mins[current] = node < mins[pre] ? node : mins[pre];
        current++;
    }

    public void pop() {
        if (current > 0) {
            current--;
        }
    }

    public int top() {
        return current < 1 ? 0 : objects[current - 1];
    }

    public int min() {
        return current > 0 ? mins[current - 1] : 0;
    }
}
