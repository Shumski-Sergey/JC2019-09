package AlexandraShokhan.lesson5;

// 4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

import java.util.Scanner;

import static AlexandraShokhan.lesson5.Task2.requestStrings;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many words would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);
        String goal = textArray[0]; // искомое слово
        for (int i = 1; i < textArray.length; i++){
            if (uniqueChars(textArray[i]) < uniqueChars(goal))
                goal = textArray[i]; // новый мин.эл
        }
        System.out.println("The word with the minimum number of various chars is: " + goal + ", the number of the different chars it has is: " + uniqueChars(goal));

    }
    // Метод, который возвращает число уникальных символов в строке
    private static int uniqueChars(String string){ // число уникальных символов
        StringBuffer uniqueChars = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
        String currentChar; // текущий символ в строке
        for (int i = 0; i < string.length(); i++) { // обход строки
            currentChar = String.valueOf(string.charAt(i)); // получить текущий символ
            if (uniqueChars.indexOf(currentChar) == -1) // символ еще не встречался
                uniqueChars.append(currentChar); // добавляем
        }
        return uniqueChars.length(); // возвращаем длину получившейся строки
    }
}
