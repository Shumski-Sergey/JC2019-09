package vtafeliuk.Lesson5.Usual;

import java.util.Scanner;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
public class TaskA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of strings:");
        int size = scanner.nextInt();
        String[] setOfStrings = new String[size];
        //наполнение массива строками
        for (int i = 0; i < setOfStrings.length; i++) {
            System.out.println("Enter the string:" + (i + 1));
            setOfStrings[i] = scanner.next();
        }
        //находим среднюю длинну строк
        double sum = 0;
        for (int i = 0; i < setOfStrings.length; i++) {
            sum += setOfStrings[i].length();
        }
        double average = sum / size;
        System.out.println("Average size of the string is:" + average);
        //выводим результат в консоль
        for (int i = 0; i < setOfStrings.length; i++) {
            if (setOfStrings[i].length() < average) {
                System.out.println("String " + (i + 1) + " is shorter than average string(average size is:" + average + "). Size of this string is: " + setOfStrings[i].length());
            }
        }
    }
}
