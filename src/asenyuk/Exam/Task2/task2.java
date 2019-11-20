package asenyuk.Exam.Task2;

import java.io.IOException;
import java.time.Month;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите месяца через пробел " );
        Scanner scn = new Scanner(System.in);
       String months= scn.nextLine();
        String [] arr =months.split(" ");
        for(String month :arr) {
            if (Integer.parseInt(month) > 0 && Integer.parseInt(month) <= 12) {

                System.out.println(Month.of(Integer.parseInt(month)));
            }
            else {
                System.out.println("Введено что-то не то,проверте");
            }
        }


    }
}
