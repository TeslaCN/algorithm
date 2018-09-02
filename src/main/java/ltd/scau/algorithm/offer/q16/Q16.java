package ltd.scau.algorithm.offer.q16;

/**
 * @author Weijie Wu
 * <p>
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Q16 {

    public static double Power(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        boolean negative = exponent < 0;
        if (negative) {
            exponent = -exponent;
        }
        double result = Power(base, exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            result *= base;
        }
        return negative ? 1 / result : result;
    }

    public static void main(String[] args) {

        System.out.println(Power(2, -16));
    }
}
