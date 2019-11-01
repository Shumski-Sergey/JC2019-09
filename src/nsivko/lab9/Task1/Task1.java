package nsivko.lab9.Task1;

import java.util.ArrayList;

import static nsivko.utils.CreateArrayListRandom.*;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите количество учеников: ");
        int studentNumber = getStudentNumber();
        ArrayList<Integer> assessmentArray;
        assessmentArray = createArrayNumber(studentNumber);

        System.out.print("Все оценки учеников: ");
        printArrayNumber(assessmentArray);
        removeNegativeElements(assessmentArray);

        System.out.print("\nВсе положительные оценки учеников: ");
        printArrayNumber(assessmentArray);
    }
}
