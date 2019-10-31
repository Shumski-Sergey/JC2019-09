package AlexandraShokhan.lesson9;

import java.util.*;

import static AlexandraShokhan.Utils.*;

//3. Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
//в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором
// они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм. Слова состоящие
// из разного количества одинаковых букв анаграммами не являются. Пример:
//
//Входная строка: «123 456 231 546 231 312 4556»
//
//Результат:
//123 231 231 312
//456 546
//4556
//Слова с разным регистром букв  не будут являться анаграммами. Решается данная проблема с помощью комманды которая
// переводит всю строку к строчному виду.
//    text = text.toLowerCase;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter words separated with spaces: ");
        String words = in.nextLine();
        List<String> wordsList = new ArrayList<>(Arrays.asList(words.split("\\s+")));
        stringListToLowerCase(wordsList);

        Map<String, String> anagram = new HashMap<>();
        for (int i = 0; i < wordsList.size(); i++) {
            String var = wordsList.get(i);
            char [] wordToSymbols = wordsList.get(i).toCharArray();
            Arrays.sort(wordToSymbols);
            String pattern = new String(wordToSymbols);

            String value = anagram.get(pattern);

            if (value == null) {
                anagram.put(pattern, var);
            } else {
                anagram.put(pattern, value + " " + var);
            }
        }
        for(String str : anagram.values()) {
            System.out.println(str);
        }
    }
}
