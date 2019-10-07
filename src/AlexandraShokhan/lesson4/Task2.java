package AlexandraShokhan.lesson4;

// 1.В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.

import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) {
        int [] grades;
        grades = new int[30];

        for (int i = 0; i <= grades.length; i++) {
            grades[i] = getRandomNum(1,10);
            System.out.println( i + " " + grades[i]);
        }





        int a = getRandomNum(1, 10);
        System.out.println(a);
    }
    public static int getRandomNum(int min, int max) {
        int i = ThreadLocalRandom.current().nextInt(min, max + 1);
        return i;
        }


}

