package nsivko.lab9.Task3;

import java.util.ArrayList;

import static nsivko.utils.CreateArrayListRandom.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите количество учеников: ");
        int studentNumber = getStudentNumber();
        ArrayList<Integer> assessmentArray;
        assessmentArray = createArrayNumber(studentNumber);

        System.out.print("Все оценки учеников: ");
        printArrayNumber(assessmentArray);

        System.out.print("\nСамая высокая оценка: " + maxElements(assessmentArray));
    }
}
