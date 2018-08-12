package ltd.scau.algorithm.basic.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 * @author Weijie Wu
 */
public class MergeSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        List<T> temp = new ArrayList<>(c.size());
//        sort(c, 0, c.size(), temp, comparator);
        sortNoRecursive(c, 0, c.size(), temp, comparator);
    }

    private <T> void sort(List<T> c, int left, int right, List<T> temp, Comparator<? super T> comparator) {
        if (right - left <= 1) {
            return;
        }
        if (left < right) {
            int mid = (left + right) / 2;
            sort(c, left, mid, temp, comparator);
            sort(c, mid, right, temp, comparator);
            merge(c, left, mid, right, temp, comparator);
        }
    }

    private <T> void sortNoRecursive(List<T> c, int left, int right, List<T> temp, Comparator<? super T> comparator) {
        if (right - left <= 1) {
            return;
        }
        int step = 2;

        while (step <= right) {

            int i;
            for (i = step; i <= right; i += step) {
                merge(c, i - step, i - step / 2, i, temp, comparator);
            }
            if (i - step / 2 < right) {
                merge(c, i - step, i - step / 2, right, temp, comparator);
            }
            step *= 2;
        }

        if (step / 2 < right) {
            merge(c, left, left + step / 2, right, temp, comparator);
        }
    }

    private <T> void merge(List<T> c, int left, int mid, int right, List<T> temp, Comparator<? super T> comparator) {
        int i = left, j = mid;
        while (i < mid && j < right) {
            if (Comparators.compare(c.get(i), c.get(j), comparator) <= 0) {
                temp.add(c.get(i++));
            } else {
                temp.add(c.get(j++));
            }
        }
        while (i < mid) {
            temp.add(c.get(i++));
        }
        while (j < right) {
            temp.add(c.get(j++));
        }
        int t = 0;
        while (left < right) {
            c.set(left++, temp.get(t++));
        }
        temp.clear();
    }
}
