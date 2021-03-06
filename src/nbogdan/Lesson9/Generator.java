package nbogdan.Lesson9;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    private static Random r = new Random();

    public static ArrayList<Integer> generateIntArrayList(int size, int maxBound) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(maxBound + 1));
        }
        return list;
    }
}
