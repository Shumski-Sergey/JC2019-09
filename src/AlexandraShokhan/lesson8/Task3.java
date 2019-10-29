package AlexandraShokhan.lesson8;

// 3.Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import static AlexandraShokhan.Utils.createRandomArrayList;
import static AlexandraShokhan.Utils.getMaxIntInArrayList;

public class Task3 {
    public static void main(String[] args) {
        int numberOfStudents = 25;
        ArrayList<Integer> studentsGrades = new ArrayList<>();
        studentsGrades = createRandomArrayList(numberOfStudents, 0, 10);
        System.out.println("The list of all students' grades is " + studentsGrades);
        int maxGrade = getMaxIntInArrayList(studentsGrades);
        System.out.println("The highest grade is " + maxGrade);
    }
}
