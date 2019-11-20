package ilyaSakalouski.K_R_20_11_19.Task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Months {
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"};

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value from 1 to 12:");
        int month = s.nextInt();
        Months m = new Months();
        m.showMonth(month);
    }

    private void showMonth(int n) {
        try {
            System.out.println(months[n - 1]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Такого месяца не существует");
        }
    }
}
