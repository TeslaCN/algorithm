package ltd.scau.algorithm.basic.sort;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * @author Weijie Wu
 */
public interface Sort {

    default <T extends Comparable<? super T>> void sort(List<T> c) {
        sort(c, null);
    }

    <T> void sort(List<T> c, Comparator<? super T> comparator);

}
