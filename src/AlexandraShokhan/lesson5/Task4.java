package AlexandraShokhan.lesson5;

// 3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

import java.util.Scanner;
import static AlexandraShokhan.lesson5.Task2.requestStrings;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many strings would you like to enter?");
        int numberOfStrings = in.nextInt();

        String[] textArray = requestStrings(numberOfStrings);

        int a = findAvgStrngLength(textArray);
        System.out.println(a);

        for (int i = 0; i <= textArray.length - 1; i++) {
            if (textArray[i].length() < 7) {
                System.out.println("Shorter than the average " + a + ": " + textArray[i]);
            } else if (textArray[i].length() > 7){
                System.out.println("Longer than the average " + a + ": " + textArray[i]);
            } else if (textArray[i].length() == 7){
                System.out.println("Equals to the average " + a + ": " + textArray[i]);
            }
        }
    }
    // Метод находит среднюю длину значений массива, состоящего из строк.
    public static int findAvgStrngLength (String array[]) {
        int avgLength;
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sum = sum + array[i].length();
        }
        avgLength = sum / array.length;
        return avgLength;
    }
}
