package nsivko.lab9.Task1;

import nsivko.utils.CreateArrayListRandom;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.print("Введите количество учеников: ");
        Scanner size = new Scanner(System.in);
        int studentNumber = size.nextInt();

        CreateArrayListRandom assessment = new CreateArrayListRandom(studentNumber);

        ArrayList<Integer> assessmentArray;
        assessmentArray = assessment.createArrayNumber(studentNumber);
        System.out.print("Все оценки учеников: ");
        printArrayNumber(assessmentArray);
        removeElements(assessmentArray);
        System.out.print("\nВсе положительные оценки учеников: ");
        printArrayNumber(assessmentArray);
    }

    private static void removeElements(ArrayList<Integer> assessmentArray) {
        for(int i = 0; i < assessmentArray.size(); i++) {
            if (assessmentArray.get(i) < 40) {
                assessmentArray.remove(i);
                i--;
            }
        }
    }

    public static void printArrayNumber(ArrayList<Integer> arrayNumber) {
        System.out.print(arrayNumber.get(0));
        for(int i = 1; i < arrayNumber.size(); i++) {
            System.out.print(", " + arrayNumber.get(i));
        }
    }


}
