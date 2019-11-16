package yKuzMinskij.Lab9_Map;

import java.util.*;

/**
 * Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
 * в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке,
 * в котором они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм.
 * Слова состоящие из разного количества одинаковых букв анаграммами не являются. Пример:
 * <p>
 * Входная строка: «123 456 231 546 231 312 4556»
 * <p>
 * Результат:
 * 123 231 231 312
 * 456 546
 * 4556
 * Слова с разным регистром букв  не будут являться анаграммами.
 * Решается данная проблема с помощью комманды которая переводит всю строку к строчному виду.
 * text = text.toLowerCase;
 */

public class TaskB1Map {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = sc.nextLine().toLowerCase().split(" ");
        HashMap<String, String> hm = new HashMap<>();
        for (String word : list) {
            char[] symbol = word.toCharArray();
            Arrays.sort(symbol);
            String s = Arrays.toString(symbol);
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s).concat(" " + word));
            } else {
                hm.put(s, word);
            }
        }
        for (HashMap.Entry entry : hm.entrySet()) {
            System.out.println("Символы : " + entry.getKey() + " Анаграммы содержащие эти символы : "
                    + entry.getValue());
        }
    }
}