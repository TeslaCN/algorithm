package ltd.scau.algorithm.basic.sort;

import java.util.*;

/**
 * @author Weijie Wu
 */
public class BubbleSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        for (int i = 0; i < c.size() - 1; i++) {
            for (int j = i + 1; j < c.size(); j++) {
                if (comparator == null) {
                    if (((Comparable)c.get(i)).compareTo(c.get(j)) > 0) {
                        Collections.swap(c, i, j);
                    }
                } else {
                    if (comparator.compare(c.get(i), c.get(j)) > 0) {
                        Collections.swap(c, i, j);
                    }
                }
            }
        }
    }
}
