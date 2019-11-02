package AlexandraShokhan.lesson8Collections;

// 3.Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;

import static AlexandraShokhan.Utils.createRandomArrayList;
import static AlexandraShokhan.Utils.getMaxIntInArrayList;

public class Task3 {
    public static void main(String[] args) {
        int numberOfStudents = 25;
        final int MIN_GRADE = 0;
        final int MAX_GRADE = 10;
        ArrayList<Integer> studentsGrades = createRandomArrayList(numberOfStudents, MIN_GRADE, MAX_GRADE);
        System.out.println("The list of all students' grades is " + studentsGrades);
        int maxGrade = getMaxIntInArrayList(studentsGrades);
        System.out.println("The highest grade is " + maxGrade);
    }
}
