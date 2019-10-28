package akhrapskaya.Lesson9;

import java.util.Iterator;

public class Task3 {
    public static void  main(String[] args){
        MyList marks = new MyList();
        marks.setListRand(0, 11, 5);
        marks.outPut();
        Iterator<Integer> iterator = marks.getIter();
        int max =0;
        while (iterator.hasNext()) {
            int t = iterator.next();
            if (t > max)
                max = t;
        }
            System.out.println("Самая лучшая оценка:" + max);
    }
}
