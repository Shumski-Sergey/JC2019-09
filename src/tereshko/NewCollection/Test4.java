package tereshko.NewCollection;

import java.util.ArrayList;
import java.util.List;

import static tereshko.NewCollection.Marks.ONEMILLION;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedlist = new ArrayList<>();
        measureTimeAdd(list);
        measureTimeAdd(linkedlist);

    }

    private static void measureTimeAdd(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < ONEMILLION; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
