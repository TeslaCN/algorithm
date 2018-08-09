package ltd.scau.algorithm.basic.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Weijie Wu
 */
public class QuickSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        quickSort(c, 0, c.size(), comparator);
    }

    private <T> void quickSort(List<T> c, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) {
            return;
        }

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

        quickSort(c, left, i, comparator);
        quickSort(c, i + 1, right, comparator);
    }

}
