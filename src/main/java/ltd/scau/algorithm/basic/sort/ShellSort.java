package ltd.scau.algorithm.basic.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Weijie Wu
 */
public class ShellSort implements Sort {

    @Override
    public <T> void sort(List<T> c, Comparator<? super T> comparator) {
        T[] a = (T[]) c.toArray();

        for (int step = c.size() / 2; step > 0; step /= 2) {
            for (int i = step; i < c.size(); i++) {
                int j = i;
                T temp = a[i];
                if (Comparators.compare(a[j], a[j - step], comparator) < 0) {
                    while (j - step >= 0 && Comparators.compare(temp, a[j - step], comparator) < 0) {
                        a[j] = a[j - step];
                        j -= step;
                    }
                }
                a[j] = temp;
            }
        }

        c.clear();
        c.addAll(Arrays.asList(a));
    }

}

