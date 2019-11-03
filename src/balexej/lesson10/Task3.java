package balexej.lesson10;
//3. Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
//в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм. Слова состоящие из разного количества одинаковых букв анаграммами не являются. Пример:
//Входная строка: «123 456 231 546 231 312 4556»
//Результат:
//123 231 231 312
//456 546
//4556
//Слова с разным регистром букв  не будут являться анаграммами. Решается данная проблема с помощью комманды которая переводит всю строку к строчному виду.
//    text = text.toLowerCase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Введите текст: ");
          String   text = sc.nextLine();
           String[] words = text.split(" ");

        Map<String, String> map = new HashMap<String,String>();
        for(int i = 0; i <= words.length - 1; i++){
            String tmpWord = words[i];
            char [] sym = words[i].toCharArray();

            Arrays.sort(sym);

            String wordKey = new String(sym);

            map.merge(wordKey, tmpWord, (a, b) -> a + " " + b);
        }
        System.out.println();
        for(String k2 : map.values()){
            System.out.println(k2);
        }
    }

}
