package vtafeliuk.Lesson5;
//Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {

        String test = "Hello, World!@#$%^&";
        String testOnlySights = test.replaceAll("(\\w)", "");
        System.out.println(testOnlySights);
        String testOnlySights1 = testOnlySights.replaceAll("\\s", "");
        System.out.println(testOnlySights1);
        String testWithoutSights = test.replaceAll("\\W", "");
        System.out.println(testWithoutSights);

        int testbBegin = test.length();
        int testEnd = testOnlySights1.length();


        System.out.println(testbBegin - testEnd);

    }
}
