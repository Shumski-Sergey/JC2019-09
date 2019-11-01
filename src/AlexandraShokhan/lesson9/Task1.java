package AlexandraShokhan.lesson9;

// 1.Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
// Избавиться от повторяющихся элементов в строке и вывести результат на экран.

import java.util.*;
import static AlexandraShokhan.Utils.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers separated with commas: ");
        String words = in.nextLine();
        Set<String> numbersSet = new HashSet<>((Arrays.asList(words.split("(\\s|\\,)+"))));
        List<String> numbersList = convertSetToArrayList(numbersSet);
        List<Integer> numberListInt = new ArrayList<>();

        for (String str : numbersList) {
            numberListInt.add(Integer.parseInt(str));
        }

        Collections.sort(numberListInt);
        printList(numberListInt);
    }
}
