package dmikulionak.lesson_8.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class collection {
    private Random random = new Random();


    public void randomList(List<Integer> list, int randRange, int sizeList) {
        for (int i = 0; i < sizeList; i++) {
            int a = random.nextInt(randRange);
            list.add(i, a);
        }
    }

    public void choiceList(List<Integer> list, int cycleChoice) {
        for (int i = 0; i < cycleChoice; i++)
            list.get((int) (Math.random() * list.size()));
    }

    public void iterator(List<Integer> list, int negative) {
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); )
            if (it.next() <= negative)
                it.remove();
    }

    public int iteratorMax(List<Integer> list) {
        int max = 0;
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            int m = it.next();
            if (m > max)
                max = m;
        }
        return max;
    }

}
