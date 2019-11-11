package asenyuk.Lesson11_Stream_API;
/*
2. Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова),
длина которых строго больше 6. В конце запятой не должно быть.
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Task2 {

   public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   String var =scn.nextLine();
   System.out.println(var);
   System.out.println("-------");
   String [] arr =var.split(" ");
   String s =Arrays.stream(arr).filter(x->x.length()>6).collect(Collectors.joining(" ,"));
    System.out.println(s);
    }
}
