package ltd.scau.algorithm.basic.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Weijie Wu
 */
class BinarySearchTest {

    private Random r = new Random();

    private static final int DEFAULT_SIZE = 8;

    //    @Test
    @RepeatedTest(100)
    void search(TestReporter reporter) {
        Set<Integer> set = new HashSet<>();
        int[] a = new int[DEFAULT_SIZE];
        while (set.size() < DEFAULT_SIZE) {
            set.add(r.nextInt(Byte.MAX_VALUE));
        }
        Integer[] array = set.toArray(new Integer[0]);
        int target = array[0] + (Math.random() > 0.5 ? 1 : 0);
        Arrays.sort(array);
        reporter.publishEntry("List", Arrays.toString(array));
        reporter.publishEntry("Target", target + "");
        for (int i = 0; i < set.size(); i++) {
            a[i] = array[i];
        }
        int index;
        reporter.publishEntry("Found", (index = BinarySearch.search(a, 0, a.length, target)) + "");
        int expected = Arrays.binarySearch(array, target);
        expected = expected < 0 ? -1 : expected;
        Assertions.assertEquals(expected, index);
    }

    @RepeatedTest(100)
    void searchWhile(TestReporter reporter) {
        Set<Integer> set = new HashSet<>();
        int[] a = new int[DEFAULT_SIZE];
        while (set.size() < DEFAULT_SIZE) {
            set.add(r.nextInt(Byte.MAX_VALUE));
        }
        Integer[] array = set.toArray(new Integer[0]);
        int target = array[0] + (Math.random() > 0.5 ? 1 : 0);
        Arrays.sort(array);
        reporter.publishEntry("List", Arrays.toString(array));
        reporter.publishEntry("Target", target + "");
        for (int i = 0; i < set.size(); i++) {
            a[i] = array[i];
        }
        int index;
        reporter.publishEntry("Found", (index = BinarySearch.searchWhile(a, 0, a.length, target)) + "");
        int expected = Arrays.binarySearch(array, target);
        expected = expected < 0 ? -1 : expected;
        Assertions.assertEquals(expected, index);
    }
}