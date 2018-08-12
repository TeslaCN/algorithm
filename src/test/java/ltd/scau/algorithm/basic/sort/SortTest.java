package ltd.scau.algorithm.basic.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

/**
 * @author Weijie Wu
 */

public class SortTest {

    @Test
    public void bubbleSort() {
        Sort s = new BubbleSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(t, l);
    }

    @Test
    public void selectionSort() {
        Sort s = new SelectionSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(t, l);
    }

    @Test
    public void insertionSort() {
        Sort s = new InsertionSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(t, l);
    }

    @Test
    public void heapSort() {
        Sort s = new HeapSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(t, l);
    }

    @Test
    public void shellSort() {
        Sort s = new ShellSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(t, l);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
    })
    public void mergeSort(int size, TestReporter testReporter) {
        Sort s = new MergeSort();
        List<Integer> l = Utils.randomList(size), t = Utils.copyIntegerList(l);
        s.sort(l);
        testReporter.publishEntry(t.toString(), l.toString());
        t.sort(null);
        Assertions.assertEquals(t, l);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
    })
    public void quickSort(int size) {
        Sort s = new QuickSort();
        List<Integer> l = Utils.randomList(size), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(t, l);
    }
}
