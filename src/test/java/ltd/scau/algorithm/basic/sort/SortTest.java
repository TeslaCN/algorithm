package ltd.scau.algorithm.basic.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertEquals(l, t);
    }

    @Test
    public void selectionSort() {
        Sort s = new SelectionSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(l, t);
    }

    @Test
    public void insertionSort() {
        Sort s = new InsertionSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(l, t);
    }

    @Test
    public void heapSort() {
        Sort s = new HeapSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(l, t);
    }

    @Test
    public void shellSort() {
        Sort s = new ShellSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(l, t);
    }

    @Test
    public void mergeSort() {
        Sort s = new MergeSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(l, t);
    }

    @Test
    public void quickSort() {
        Sort s = new QuickSort();
        List<Integer> l = Utils.randomList(16), t = Utils.copyIntegerList(l);
        s.sort(l);
        t.sort(null);
        Assertions.assertEquals(l, t);
    }
}
