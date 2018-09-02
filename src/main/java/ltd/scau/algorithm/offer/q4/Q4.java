package ltd.scau.algorithm.offer.q4;

/**
 * @author Weijie Wu
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Q4 {

    public boolean find(int target, int[][] array) {
        if (array == null || array.length < 1 || array[0].length < 1) {
            return false;
        }
        int x = array.length;
        int y = array[0].length - 1;
        for (int i = 0; i < x; i++) {
            while (y >= 0 && array[i][y] > target) {
                y--;
            }
            if (y >= 0 && array[i][y] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
