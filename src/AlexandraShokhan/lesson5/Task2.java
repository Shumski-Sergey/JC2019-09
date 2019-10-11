package AlexandraShokhan.lesson5;

//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many strings would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);

        String longest = getLongestString(textArray);
        System.out.println("The longest string is: "+ longest + ". Its length is " + longest.length());

        String shortest = getShortestString(textArray);
        System.out.println("The shortest string is: "+ shortest + ". Its length is " + shortest.length());

    }

    public static String[] requestStrings(int strNum) {
        String[] array = new String[strNum];
        for (int i = 0; i <= array.length - 1; i++) {
            Scanner inn = new Scanner(System.in);
            System.out.println("Enter string # " + (i + 1) + ":");
            array[i] = inn.nextLine();
        }
        return array;
    }

    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static String getShortestString(String[] array) {
        int minLength = 10000000;
        String shortestString = null;
        for (String s : array) {
            if (s.length() < minLength) {
                minLength = s.length();
                shortestString = s;
            }
        }
        return shortestString;
    }
}
