package ltd.scau.algorithm.basic.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Weijie Wu
 */
public class HeapSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        for (int i = c.size() / 2 - 1; i >= 0; i--) {
            adjust(c, i, c.size(), comparator);
        }
        for (int j = c.size() - 1; j >= 0; j--) {
            Collections.swap(c, 0, j);
            adjust(c, 0, j, comparator);
        }
    }

    private <T> void adjust(List<T> c, int root, int length, Comparator<? super T> comparator) {
        T element = c.get(root);
        for (int child = root * 2 + 1; child < length; child = child * 2 + 1) {

            if (child + 1 < length && Comparators.compare(c.get(child), c.get(child + 1), comparator) < 0) {
                child++;
            }

            if (Comparators.compare(element, c.get(child), comparator) < 0) {
                c.set(root, c.get(child));
                root = child;
            } else {
                break;
            }
        }
        c.set(root, element);
    }

}
