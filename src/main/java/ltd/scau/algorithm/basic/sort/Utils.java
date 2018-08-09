package ltd.scau.algorithm.basic.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Weijie Wu
 */
public class Utils {

    private static final Random random = new Random();

    public static int randInt() {
        return random.nextInt();
    }

    public static <T> void swap(T[] objects, int a, int b) {
        T tmp = objects[a];
        objects[a] = objects[b];
        objects[b] = tmp;
    }

    public static Integer randInt(int i) {
        return random.nextInt(i);
    }

    public static List<Integer> randomList(int size, int bound) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(randInt(bound));
        }
        return list;
    }

    public static List<Integer> randomList(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }

    public static List<Integer> copyIntegerList(List<Integer> source) {
        List<Integer> list = new ArrayList<>();
        list.addAll(source);
        return list;
    }
}
