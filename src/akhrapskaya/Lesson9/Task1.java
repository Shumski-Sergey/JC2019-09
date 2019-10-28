package akhrapskaya.Lesson9;

import java.util.Iterator;

public class Task1 {
    public static void  main(String[] args){
        MyList marks = new MyList();
        MyList badMarks = new MyList();
        marks.setListRand(0, 11, 20);
        marks.outPut();
        Iterator<Integer> iterator = marks.getIter();
        while (iterator.hasNext()){
            int k =iterator.next();
            if (k < 4 ) {
                badMarks.setElAtList(k);
                iterator.remove();
            }
        }
        System.out.println("Неудовлетворительные оценки:");
        badMarks.outPut();
        System.out.println("Удовлетворительные оценки:");
        marks.outPut();
    }
}
