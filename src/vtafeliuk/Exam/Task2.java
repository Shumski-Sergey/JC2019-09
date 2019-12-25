package vtafeliuk.Exam;

//Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// (Осуществить проверку корректности ввода чисел).

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        String[] months = new String[]{"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        System.out.println("Enter the number from 1 to 12: ");
        try {
            int monthIndex = new Scanner(System.in).nextInt() - 1;
            if (monthIndex >= 0 && monthIndex <= 11) {
                System.out.println(months[monthIndex]);
          } else
              System.out.println("U are drunk. U entered wrong NUMBER.");

        } catch (InputMismatchException e) {
            System.out.println("U are drunk. U entered wrong SYMBOL(S).");
        }
    }
}