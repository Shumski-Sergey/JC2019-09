package ilyaSakalouski.lesson_9;

import java.util.*;

public class A2
{
    public static void main(String[] args)
    {
        int top = 10;
        ArrayList<Integer> mark = new ArrayList<>();

        for (int i = 0; i < top; i++)
        {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }

        System.out.println(mark);

        Set<Integer> set = new HashSet<>(mark);
        mark.clear();
        mark.addAll(set);

        System.out.println(set);
    }
}
