package vtafeliuk.Lesson5.Usual;
//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of strings: ");
        int size = scanner.nextInt();
        String[] setOfStrings = new String[size];
        //наполнение массива
        for (int i = 0; i < setOfStrings.length; i++) {
            System.out.println("Fill the string #" + (i + 1));
            setOfStrings[i] = scanner.next();
        }
        //сортировка пузырьками
        for (int i = setOfStrings.length-1; 0 < i; i--) {
            for (int j = 0; j < i; j++) {
                if(setOfStrings[j].length() > setOfStrings[j+1].length()){
                    String temp = setOfStrings[j];
                    setOfStrings[j] = setOfStrings[j+1];
                    setOfStrings[j+1] = temp;
                }
            }
        }
        //вывод отсортированного массива
        for (int i = 0; i < setOfStrings.length; i++) {
            System.out.println(setOfStrings[i]);
        }

    }
}
