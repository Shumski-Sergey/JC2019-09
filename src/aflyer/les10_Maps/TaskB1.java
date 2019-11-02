package aflyer.les10_Maps;
//Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
//в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке,
// в котором они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм.
//Слова состоящие из разного количества одинаковых букв анаграммами не являются.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main ( String[] args ) {
        System.out.println("Введите слова");
        Scanner sc = new Scanner(System.in);
        String InputString = sc.nextLine();
        Pattern pattern = Pattern.compile("\\s");
        String [] WordsArray = pattern.split(InputString);
        HashMap <String, String> mapa = new HashMap <>();
        for (String x:WordsArray) {
            char [] letters = x.toCharArray();
            Arrays.sort(letters);
            if (mapa.containsKey(Arrays.toString(letters))){
                mapa.put(Arrays.toString(letters), mapa.get(Arrays.toString(letters))+" "+ x);
                }
            else{
                mapa.put(Arrays.toString(letters), x);
            }


        }
        for (HashMap.Entry<String, String> item : mapa.entrySet()) {
            System.out.println(item.getValue());}

    }
}
