package dmikulionak.lesson_3;
// Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class task3 {
    public static void main (String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int x = s1.nextInt();
        x1 (x) ;
    }
    private static void x1 ( long x ) {
        if ( x == 0 ) return;
        x1( x / 1000 );
        System.out.print( x % 1000 + " " );
    }
}


