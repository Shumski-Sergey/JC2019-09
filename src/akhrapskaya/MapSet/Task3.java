package akhrapskaya.MapSet;

/*3. Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором
они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм. Слова состоящие
из разного количества одинаковых букв анаграммами не являются.*/

import java.util.*;

public class Task3 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = sc.nextLine().toLowerCase();
        String[] words = line.split("[^а-яА-Я\\w]+");
        HashMap<String, String> ans = anagramMap(words);
        for( String s : ans.values()){
            System.out.println(s);
        }
    }
    private static HashMap<String, String> anagramMap(String[] words) {
        HashMap<String, String> ans = new HashMap<>();
        for (String s : words){
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            if(ans.containsKey(key))
                ans.put(key, ans.get(key).concat(" " + s));
             else
                ans.put(key, s);
        }
        return ans;
    }
}
