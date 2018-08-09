package ltd.scau.algorithm.basic.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Weijie Wu
 */
public class InsertionSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        T[] objects = (T[]) c.toArray();
        for (int i = 1; i < objects.length; i++) {
            T e = objects[i];
            int j;
            for (j = i; j > 0; j--) {
                if (comparator == null) {
                    if (((Comparable)e).compareTo(objects[j - 1]) >= 0) {
                        break;
                    }
                } else {
                    if (comparator.compare(e, objects[j - 1]) >= 0) {
                        break;
                    }
                }
                objects[j] = objects[j - 1];
            }
            objects[j] = e;
        }
        c.clear();
        c.addAll(Arrays.asList(objects));
    }
}
