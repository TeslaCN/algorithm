package ltd.scau.algorithm.offer.q29;

import java.util.ArrayList;

/**
 * @author Weijie Wu
 *
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Q29 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();

        final int boundary = Integer.min(matrix.length, matrix[0].length);

        for (int offset = 0; offset < (boundary + 1) >> 1; offset++) {
            list.addAll(printCircle(matrix, offset));
        }

        return list;
    }

    private static ArrayList<Integer> printCircle(int[][] a, int offset) {
        ArrayList<Integer> list = new ArrayList<>();
        final int right = a[offset].length - offset;
        final int down = a.length - offset;

        for (int i = offset; i < right; i++) {
            list.add(a[offset][i]);
        }
        if (down > offset) {
            for (int i = offset + 1; i < down; i++) {
                list.add(a[i][right - 1]);
            }
        }
        if (right > offset && down - 1 != offset) {
            for (int i = right - 1 - 1; i >= offset; i--) {
                list.add(a[down - 1][i]);
            }
        }
        if (down - offset > 1 && right - 1 != offset) {
            for (int i = down - 1 - 1; i > offset; i--) {
                list.add(a[i][offset]);
            }
        }


        return list;
    }

    public static void main(String[] args) {
        int[][] a = {
//                {1},
//                {2},
//                {3},
//                {4},
//                {5},
//                {1, 2},
//                {3, 4},
//                {5, 6},
//                {7, 8},
//                {9, 10},
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16},
//                {17, 18, 19, 20},
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15},
//                {16, 17, 18, 19, 20},
//                {21, 22, 23, 24, 25},
        };
        System.out.println(printMatrix(a));
//        System.out.println(printCircle(a, 0));
//        System.out.println(printCircle(a, 1));
//        System.out.println(printCircle(a, 2));
    }
}
