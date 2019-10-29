package ilyaSakalouski.lesson_9;

import java.util.ArrayList;
import java.util.Collections;

public class A1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++)
        {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> negativeList = new ArrayList<>();

        for (int i = 0; i < 11; i++)
        {
            int a = list.get(i);
            if (a <= 3)
            {
                negativeList.add(a);
            }
        }
        System.out.println(negativeList);
    }
}
