package ilyaSakalouski.lesson_9;

import java.util.ArrayList;
import java.util.Collections;

public class A1 {
    public static void main(String[] args)
    {
        final int MAX_MARK = 10;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= MAX_MARK; i++)
            list.add(i);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> negativeList = new ArrayList<>();
        for (int i = 0; i <= MAX_MARK; i++)
        {
            int a = list.get(i);
            if (a <= 3)
                negativeList.add(a);
        }
        System.out.println(negativeList);
    }
}
