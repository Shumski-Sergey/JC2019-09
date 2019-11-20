package balexej.Test1;

import java.util.Scanner;

public class Task2 {
   static  void setMonth (int a){
       String[] month = {"январь","февраль","март","апрель","май", "июнь", "июль", "август", "сентябрь",
               "октябрь", "ноябрь", "декабрь"};
       String s;
       try {
           s = month[a-1];
           System.out.println(" Месяц - "+ s );
       } catch (ArrayIndexOutOfBoundsException e){
           System.out.println(" Такого месяца не существует");
       }
   }

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println(" Введите номер  месяца: ");
      int n = sc.nextInt();
     setMonth(n);
   }
}
