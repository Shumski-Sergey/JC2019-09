package vtafeliuk.Lesson5.Usual;

import java.util.Scanner;
import java.util.regex.Matcher;

//Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
// а среди них – количество слов с равным числом гласных и согласных букв.
public class TaskA5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of words");
        int size = scanner.nextInt();
        String[] words = new String[size];
        //наполняем массив мловами с консоли
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter the " + (i + 1) + " word");
            words[i] = scanner.next();
        }

        String latin = "[a-zA-Z]+";
        int amountOfLatins = 0;

        for (String s : words) {
            if (s.matches(latin)) {
                amountOfLatins += 1;
            }
        }

        System.out.println("Количество слов с использованием только латинских символов равняется: " + amountOfLatins);

        int amountEquals = 0;

        for (String word : words) {
            int vowels = 0;
            int consonants = 0;
            for (int j = 0; j < word.length(); j++) {
                switch (word.charAt(j)) {
                    case 'a':
                        vowels++;
                        break;
                    case 'o':
                        vowels++;
                        break;
                    case 'i':
                        vowels++;
                        break;
                    case 'e':
                        vowels++;
                        break;
                    case 'u':
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            }
            if (vowels == consonants) {
                amountEquals++;
            }
        }
        System.out.println("Количество слов с равным количеством гласных и согласных: " + amountEquals);
    }
}
