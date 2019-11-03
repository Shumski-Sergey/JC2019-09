package vtafeliuk.Lesson10Map;
//Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
//в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм. Слова состоящие из разного количества одинаковых букв анаграммами не являются. Пример:
//
//Входная строка: «123 456 231 546 231 312 4556»
//
//Результат:
//123 231 231 312
//456 546
//4556
//Слова с разным регистром букв  не будут являться анаграммами. Решается данная проблема с помощью комманды которая переводит всю строку к строчному виду.
//    text = text.toLowerCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine().toLowerCase();
        String[] words = text.replaceAll("\\p{Punct}", "").toLowerCase().split("\\s+");

        HashMap<String, String> anagramsMap = getStringStringHashMap(words);

        for (HashMap.Entry<String, String> anagram : anagramsMap.entrySet()) {
            System.out.println(anagram.getValue());
        }
    }

    private static HashMap<String, String> getStringStringHashMap(String[] words) {
        HashMap<String, String> anagramsMap = new HashMap<>();
        for (String word : words) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            if (anagramsMap.containsKey(Arrays.toString(letters))) {
                anagramsMap.put(Arrays.toString(letters), anagramsMap.get(Arrays.toString(letters)).concat(" " + word));
            } else {
                anagramsMap.put(Arrays.toString(letters), word);
            }
        }
        return anagramsMap;
    }

}
