package asenyuk.Lesson9_Collection_MAP;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Пользователь вводит через один пробел слова. Найти все группы анаграмм (слов, составленных из одних и тех же букв)
в этой строке и вывести в консоль их каждую с новой строки, все слова должны идти через пробел в порядке, в котором
они встречаются в строке. При этом допускается выводить одинаковые слова в одной строке анаграмм. Слова состоящие
из разного количества одинаковых букв анаграммами не являются
 */

public class Lesson9 {
    public static void main (String [] args){
        Integer y = 1;
        Integer x=0;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
       // String line="123 321 567 213 189";
String [] words=line.split(" ");
        HashMap<String,Integer> map0 = new HashMap<>();
  for (String word: words) {
    map0.clear();
    for (String word1: words) {
        map0.put(word1,y);
    }
    System.out.println("Cлово    " +word);
      String[] ArrSymbol = word.split("");
    for (String symbol : ArrSymbol) {
          for (Map.Entry<String,Integer> map0Word: map0.entrySet() ) {
            if (map0Word.getValue()==1 ) {
                if (map0Word.getKey().indexOf(symbol)==-1) {
                    map0Word.setValue(x);
                }
             }
            }
        }
    for (Map.Entry<String,Integer> map0Word: map0.entrySet() ) {
        if ((map0Word.getValue()==1) && (map0Word.getKey().length()==word.length())) {
                    System.out.println("имеет следующие анаграммы " + map0Word.getKey() );
                   }
            }
    System.out.println("------");
        }
    }
}


