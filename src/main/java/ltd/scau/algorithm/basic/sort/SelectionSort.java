package ltd.scau.algorithm.basic.sort;

import java.util.*;

/**
 * @author Weijie Wu
 */
public class SelectionSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        for (int i = 0; i < c.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < c.size(); j++) {
                if (comparator == null) {
                    minIndex = ((Comparable) c.get(minIndex)).compareTo(c.get(j)) > 0 ? j : minIndex;
                } else {
                    minIndex = comparator.compare(c.get(minIndex), c.get(j)) > 0 ? j : minIndex;
                }
            }
            if (minIndex != i) {
                Collections.swap(c, i, minIndex);
            }
        }
    }
}
