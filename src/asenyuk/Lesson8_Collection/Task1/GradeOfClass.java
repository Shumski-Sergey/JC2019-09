package asenyuk.Lesson8_Collection.Task1;
/*
Создать список оценок учеников с помощью ArrayList, заполнить
случайными оценками. Удалить неудовлетворительные оценки из списка.

 */


import java.util.ArrayList;

public class GradeOfClass {
    public static void main(String[] args) {
        final Integer minSatisfiedGrade = 4;

        ControlTest controlTest = new ControlTest();
        ArrayList<Integer> currentGrades = new ArrayList<>();

        currentGrades = controlTest.doContralTest();

        for (Integer currentMark : currentGrades) {
            System.out.println(currentMark);
        }
        System.out.println("----------------------------");

        currentGrades.removeIf(i -> (i < minSatisfiedGrade));


        System.out.println("----------------------------");

        for (Integer currentMark : currentGrades) {
            System.out.println(currentMark);
        }

    }
}