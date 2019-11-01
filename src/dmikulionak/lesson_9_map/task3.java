package dmikulionak.lesson_9_map;
//3. Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
//в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором они
// встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм. Слова состоящие из разного
// количества одинаковых букв анаграммами не являются. Пример:
//
//Входная строка: «123 456 231 546 231 312 4556»
//
//Результат:
//123 231 231 312
//456 546
//4556
//Слова с разным регистром букв  не будут являться анаграммами. Решается данная проблема с помощью комманды которая переводит всю строку к строчному виду.
//    text = text.toLowerCase;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слова через пробел: ");
        String text = in.nextLine();
        text = text.toLowerCase();
        String[] words = text.split(" ");
        String[] wordsNew = new String[words.length];


        for (int i = 0; i < words.length; i++) {
            String input = words[i];
            char[] charArray = input.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            wordsNew[i] = sortedString;
        }

        Map<String, ArrayList<Integer>> wordsMap = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            ArrayList<Integer> curList = wordsMap.getOrDefault(wordsNew[i], new ArrayList<Integer>());
            curList.add(i);
            wordsMap.put(wordsNew[i], curList);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        for (ArrayList<Integer> integers : wordsMap.values()) {
            ArrayList<Integer> tempp = new ArrayList<>();
            tempp = integers;
            for (int i = 0; i < tempp.size(); i++) {
                int a = tempp.get(i);
                System.out.print(words[a] + " ");
            }
            System.out.println(" ");
        }
    }
}




