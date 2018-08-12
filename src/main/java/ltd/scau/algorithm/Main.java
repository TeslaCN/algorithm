package ltd.scau.algorithm;

import ltd.scau.algorithm.basic.sort.MergeSort;
import ltd.scau.algorithm.basic.sort.QuickSort;
import ltd.scau.algorithm.basic.sort.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
//        Integer[] a = Utils.randomList(8).toArray(new Integer[0]);
        List<Integer> l = Utils.randomList(11);
        System.out.println(l);
        new MergeSort().sort(l);
        System.out.println(l);
    }
}
