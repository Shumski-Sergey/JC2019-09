package zyahya.LinesNoRegex;

import java.util.Scanner;
// Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
public class Number1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first text: ");
        String str1 = input.next();
        System.out.println("Enter your second text: ");
        String str2 = input.next();
        if(str1.length() > str2.length()){
            System.out.println("Your first text is bigger than the second one");
        }
        if(str1.length() < str2.length()){
            System.out.println("Your first text is smaller than the second one");
        }
        if(str1.length() == str2.length()){
            System.out.println("They are equal");
        }

    }
}
