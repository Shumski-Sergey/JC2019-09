package aflyer.les10_Maps;
//Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”).
// Избавиться от повторяющихся элементов в строке и вывести результат на экран.

import aflyer.Methods.SetMethod;

import java.util.*;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main ( String[] args ) {
        String input;
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Введите набор чисел" );
        input = sc.nextLine ( );
        Pattern pattern = Pattern.compile ( ", " );
        String[] Numbers = pattern.split ( input );
        HashSet NumbSet = new HashSet ();
        for (String x: Numbers) {
            NumbSet.add(Integer.parseInt (x));
        }
        SetMethod.setOutput ( NumbSet );
    }

}
