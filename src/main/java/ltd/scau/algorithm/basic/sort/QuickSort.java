package ltd.scau.algorithm.basic.sort;

import java.util.*;

/**
 * @author Weijie Wu
 */
public class QuickSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
//        quickSort(c, 0, c.size(), comparator);
        quickSortNoRecursive(c, 0, c.size(), comparator);
    }

    private <T> void quickSort(List<T> c, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) {
            return;
        }

        int i = partition(c, left, right, comparator);

        quickSort(c, left, i, comparator);
        quickSort(c, i + 1, right, comparator);
    }

    private <T> int partition(List<T> c, int left, int right, Comparator<? super T> comparator) {
        T base = c.get(left);

        int i = left, j = right - 1;

        while (i != j) {

            while (i < j && Comparators.compare(base, c.get(j), comparator) <= 0) {
                j--;
            }

            while (i < j && Comparators.compare(base, c.get(i), comparator) >= 0) {
                i++;
            }

            if (i < j) {
                Collections.swap(c, i, j);
            }
        }
        c.set(left, c.get(i));
        c.set(i, base);
        return i;
    }

    private <T> void quickSortNoRecursive(List<T> c, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) {
            return;
        }
        Stack<Position> stack = new Stack<>();
        stack.push(new Position(left, right));
        while (!stack.empty()) {
            Position p = stack.pop();
            int i = p.left, j = p.right;

            if (i < j) {

                int k = partition(c, i, j, comparator);

//                if (k > i) {
                    stack.push(new Position(i, k));
//                }
//                if (j > k) {
                    stack.push(new Position(k + 1, j));
//                }
            }
        }
    }

    private static final class Position {

        private final int left;

        private final int right;

        public Position(int left, int right) {
            this.left = left;
            this.right = right;
        }

    }

}
