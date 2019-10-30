package balexej.Lesson8Colletion;
//1. Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args){
        ArrayList<Integer> grade = new ArrayList<Integer>();
        for (int i = 0; i<10; i++){
            int a = (int)(Math.random()*10);
            grade.add(a);
        }
        Collections.shuffle(grade);
        System.out.println(grade);


        ArrayList<Integer> badGrade = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            int b = grade.get(i);
            if (b <= 3)
            {
                badGrade.add(b);

            }
        }
        System.out.println(badGrade);
    }
}
