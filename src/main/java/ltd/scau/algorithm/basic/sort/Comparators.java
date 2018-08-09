package ltd.scau.algorithm.basic.sort;

import java.util.Comparator;

/**
 * @author Weijie Wu
 */
public class Comparators {

    public static <T> int compare(T a, T b, Comparator<? super T> c) {
        return c == null ? ((Comparable) a).compareTo(b) : c.compare(a, b);
    }
}
