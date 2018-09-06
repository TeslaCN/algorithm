package ltd.scau.algorithm.offer.q39;

/**
 * @author Weijie Wu
 * <p>
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Q39 {

    public int moreThanHalfNumFor(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int count = 1;
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            if (num == array[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                num = array[i];
                count++;
            }
        }
        return check(array, num) ? num : 0;
    }

    private boolean check(int[] a, int num) {
        if (a == null || a.length < 1) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i] == num ? 1 : 0;
        }
        return count > a.length / 2;
    }

    @Deprecated
    public int moreThanHalfNum(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }

        int index = partition(array, 0, array.length);
        int mid = array.length / 2;

        while (mid != index) {
            if (index < mid) {
                index = partition(array, index, array.length);
            }
            if (index > mid) {
                index = partition(array, 0, index);
            }
        }

        return array[index];
    }

    @Deprecated
    private int partition(int[] array, int left, int right) {

        int i = left, j = right - 1;
        int s = array[(int) (left + Math.random() * (right - left))];

        while (i != j) {

            while (j > i && array[j] >= s) {
                j--;
            }

            while (i < j && array[i] <= s) {
                i++;
            }

            if (i != j) {
                swap(array, i, j);
            }
        }
        return i;
    }

    @Deprecated
    private static void swap(int[] a, int i, int j) {
        int forSwap = a[i];
        a[i] = a[j];
        a[j] = forSwap;
    }

    public static void main(String[] args) {
        Q39 q = new Q39();
        System.out.println(q.moreThanHalfNumFor(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}
