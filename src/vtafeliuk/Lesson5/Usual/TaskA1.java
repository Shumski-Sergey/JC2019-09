package vtafeliuk.Lesson5.Usual;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String smallestString = "";
        String biggestString = "";
        int maxSize = Integer.MIN_VALUE;
        int minSize = Integer.MAX_VALUE;
        System.out.println("Введите кол-во строк (число должно быть больше 1): ");
        int size = scanner.nextInt();
        String[] setStrings = new String[size];
        if (size < 2) {
            System.out.println("Введённое число меньше 2. Попробуйте заново.");
        } else {
            for (int i = 0; i < setStrings.length; i++) {
                System.out.println("Fill the string #" + (i + 1));
                setStrings[i] = scanner.next();
                if (setStrings[i].length() < minSize) {
                    smallestString = setStrings[i];
                    minSize = setStrings[i].length();
                }
                if (setStrings[i].length() > maxSize) {
                    biggestString = setStrings[i];
                    maxSize = setStrings[i].length();
                }
            }
            if (maxSize == minSize) {
                System.out.println("Strings are equal");
            } else {
                System.out.println("Max string is #" + maxSize);
                System.out.println("Min string is #" + minSize);
                System.out.println("Max string is " + biggestString);
                System.out.println("Min string is " + smallestString);
            }


        }
    }
}
