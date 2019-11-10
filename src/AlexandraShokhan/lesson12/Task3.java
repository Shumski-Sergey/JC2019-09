package AlexandraShokhan.lesson12;

// Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось
// до Нового года. При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
//Входные данные
//Входная строка содержит два целых числа: номер месяца и номер дня в этом месяце.
//
//Выходные данные
//Программа должна вывести количество дней, оставшихся до Нового года. Если введены неверные данные, нужно вывести
// число -1.
//
//Примеры
//входные данные
//1 2
//выходные данные
//363
//
//входные данные
//12 30
//выходные данные
//1


import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws DateTimeException {

        LocalDate newYear = LocalDate.of(2019, 12, 31);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        int month = in.nextInt();

        System.out.println("Enter the number of the day: ");
        int day = in.nextInt();

        try {
            LocalDate date = LocalDate.of(2019, month, day);

            Duration duration = Duration.between(date.atStartOfDay(), newYear.atStartOfDay());
            long daysLeftToNewYear = duration.toDays();

            System.out.println(daysLeftToNewYear + " days is left till New Year.");
        }
        catch (DateTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
