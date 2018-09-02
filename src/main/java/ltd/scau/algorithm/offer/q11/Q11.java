package ltd.scau.algorithm.offer.q11;

/**
 * @author Weijie Wu
 * <p>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Q11 {

    @Deprecated
    public static int enumMinNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return array[i + 1];
            }
        }
        return -1;
    }

    public static int minNumberInRotateArray(int[] a) {
        if (a == null || a.length == 0) {
            return 0;
        }
        if (a[0] < a[a.length - 1]) {
            return a[0];
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(enumMinNumberInRotateArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(minNumberInRotateArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(minNumberInRotateArray(new int[]{1, 0, 1, 1, 1}));

    }
}
