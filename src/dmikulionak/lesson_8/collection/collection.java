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



    public int iteratorMin(List<Integer> list) {
        int min = 0;
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            int m = it.next();
            if (m < min)
                min = m;
        }
        return min;
    }

    public void month (int month) {
        switch (month) {
            case (1):
                System.out.println("Январь");
                break;
            case (2):
                System.out.println("Февраль");
                break;
            case (3):
                System.out.println("Март");
                break;
            case (4):
                System.out.println("Апрель");
                break;
            case (5):
                System.out.println("Май");
                break;
            case (6):
                System.out.println("Июнь");
                break;
            case (7):
                System.out.println("Июль");
                break;
            case (8):
                System.out.println("Май");
                break;
            case (9):
                System.out.println("Сентябрь");
                break;
            case (10):
                System.out.println("Октябрь");
                break;
            case (11):
                System.out.println("Ноябрь");
                break;
            case (12):
                System.out.println("Декабрь");
                break;
        }
    }

}
