package aflyer.les5;
//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.JSType.toCharSequence;

public class TaskA4 {
    public static int CountChars(String s){
        char [] StoWord = s.toCharArray();
        String NewS="";
        for (char x: StoWord){
            if (!NewS.contains(toCharSequence(x))) {NewS += x;}
        }
        return NewS.length();
    }

    public static void main(String[] args) {
        System.out.println("Введите число слов n");
        Scanner sc= new Scanner(System.in);
        String str[]= new String [sc.nextInt()];
        for (int i=0; i<str.length; i++)
            str[i]=sc.next();
        int min= Integer.MAX_VALUE;
        String MinString="";

            for (String x: str){
                //System.out.print(x + " ");
                //System.out.println(CountChars(x));
             if (CountChars(x)<min) {
                 min=CountChars(x);
                 MinString=x;
             }
            }
        System.out.println(MinString + " " + min);

            }
        }



