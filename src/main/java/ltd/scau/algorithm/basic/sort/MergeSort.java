package ltd.scau.algorithm.basic.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Weijie Wu
 */
public class MergeSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        List<T> temp = new ArrayList<>(c.size());
        sort(c, 0, c.size(), temp, comparator);
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
