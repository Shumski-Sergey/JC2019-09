package AlexandraShokhan.control.Task2;

// 2. Ввести число от 1 до 12. Вывести на консоль название месяца, соответ-ствующего данному числу.
// (Осуществить проверку корректности ввода чисел).

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] allMonths = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of the month from 1 to 12: ");
        int month = in.nextInt();
        try {
            System.out.println("This month is " + allMonths[month - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Such month does not exist.");
        }
    }
}

