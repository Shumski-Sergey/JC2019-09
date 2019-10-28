package nsivko.lab9.Task3;

import nsivko.utils.CreateArrayListRandom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Integer Max = 0;

        System.out.print("Введите количество учеников: ");
        Scanner size = new Scanner(System.in);
        int studentNumber = size.nextInt();

        CreateArrayListRandom assessment = new CreateArrayListRandom(studentNumber);

        ArrayList<Integer> assessmentArray;
        assessmentArray = assessment.createArrayNumber(studentNumber);
        System.out.print("Все оценки учеников: ");
        printArrayNumber(assessmentArray);
        System.out.print("\nСамая высокая оценка: " + maxElements(assessmentArray));

    }

    private static Integer maxElements(ArrayList<Integer> assessmentArray) {
        Iterator<Integer> iterator = assessmentArray.iterator();
        Integer max = 0;
       while (iterator.hasNext()) {
           Integer numberIterator = iterator.next();
           if (numberIterator > max) {
               max = numberIterator;
           }
        }
        return max;
    }

    public static void printArrayNumber(ArrayList<Integer> arrayNumber) {
        System.out.print(arrayNumber.get(0));
        for(int i = 1; i < arrayNumber.size(); i++) {
            System.out.print(", " + arrayNumber.get(i));
        }
    }


}
