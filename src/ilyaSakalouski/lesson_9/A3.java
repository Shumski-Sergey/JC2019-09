package ilyaSakalouski.lesson_9;

import java.util.ArrayList;
import java.util.Collections;

public class A3
{
    public static void main(String[] args)
    {
        int max = 10;
        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < max; i++)
        {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }
        System.out.println(mark);
        System.out.println(Collections.max(mark));
    }
}
