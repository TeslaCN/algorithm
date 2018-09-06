package ltd.scau.algorithm.offer.q40;

import java.util.ArrayList;

/**
 * @author Weijie Wu
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Q40 {

    private ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        if (input == null || input.length < 0 || k < 1) {
            return result;
        }
        get(input, 0, input.length, k);

        return result;
    }

    private void get(int[] a, int left, int right, int k) {
        if (k < 1) {
            return;
        }
        int index = partition(a, left, right);

        if (index - left <= k) {
            for (int i = left; i < index; i++) {
                result.add(a[i]);
            }
            get(a, index, right, k - (index - left));
        } else {
            get(a, left, index, k);
        }

    }

    private int partition(int[] a, int left, int right) {
        if (a == null || a.length < 1) {
            return -1;
        }
        int base = a[left];
        int i = left, j = right - 1;

        while (i != j) {

            while (j > i && a[j] >= base) {
                j--;
            }

            while (i < j && a[i] <= base) {
                i++;
            }

            swap(a, i, j);
        }
        a[left] = a[i];
        a[i] = base;
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        int forSwap = a[i];
        a[i] = a[j];
        a[j] = forSwap;
    }

    public static void main(String[] args) {
        Q40 q = new Q40();
        System.out.println(q.getLeastNumbers(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4));
    }
}
