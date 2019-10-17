package AlexandraShokhan.lesson6;

// 1.Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        // Запрашиваем часы, минуты и секунды для итервала № 1.
        Scanner in = new Scanner(System.in);
        System.out.println("Set time interval # 1.");
        System.out.println("Hours = ");
        int h1 = in.nextInt();
        System.out.println("Minutes = ");
        int m1 = in.nextInt();
        System.out.println("Seconds = ");
        int s1 = in.nextInt();

        System.out.println("Set time interval # 2.");
        System.out.println("Seconds = ");
        int s2 = in.nextInt();

        // Создаем два объекта класса TimeInterval
        TimeInterval time1 = new TimeInterval(s1, m1, h1);
        TimeInterval time2 = new TimeInterval(s2);

        // С помощью метода класса получаем общее время в секундах для обоих объектов.
        Integer time1InSec = time1.getTimeInSec();
        Integer time2InSec = time2.getTimeInSec();

        // Сравниваем
        compareTimeIntervals(time1InSec, time2InSec);

        // Печатаем время.
        time1.printTime();
        time2.printTime();
    }

    static void compareTimeIntervals(Integer time1, Integer time2) {
        int output = time1.compareTo(time2);
        if (output == 1) {
            System.out.println(time1 + " > " + time2);
        } else if (output == -1) {
            System.out.println(time1 + " < " + time2);
        } else if (output == 0) {
            System.out.println(time1 + " = " + time2);
        } else System.out.println("Error");
    }
}