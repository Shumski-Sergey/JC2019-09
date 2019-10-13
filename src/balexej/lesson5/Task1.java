package balexej.lesson5;

import java.util.Scanner;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину
public class Task1 {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("Введите 2 строки ");
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        int a = text1.length();
        int b = text2.length();



        if (a > b){
            System.out.println( "\nСтрока " + text1 + " длиннее " + text2);
        }
        if (a < b){
            System.out.println( "\nСтрока " + text2 +" длиннее " + text1 );
        }
        if (a == b){
            System.out.println( "\nСтроки " + text1 + "  и " + text2 + " равны ");
        }


        }

            }




