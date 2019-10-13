package AlexandraShokhan.lesson6;

// 1.Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class Time {
    public static void main(String[] args) {

        // Создаем два объекта класса TimeInterval
        TimeInterval time1 = new TimeInterval(30, 50, 40);
        TimeInterval time2 = new TimeInterval(34,140, 38);

        // С помощью метода класса получаем общее время в секундах для обоих объектов.
        int time1InSec = time1.getTimeInSec();
        int time2InSec = time2.getTimeInSec();

        // Сравниваем
        compareTimeIntervals(time1InSec, time2InSec);
    }

    private static void compareTimeIntervals(int time1, int time2) {
        if (time1 > time2) {
            System.out.println(time1 + " > " + time2);
        } else if (time1 < time2) {
            System.out.println(time1 + " < " + time2);
        } else if (time1 == time2) {
            System.out.println(time1 + " = " + time2);
        }
    }
}

class TimeInterval{

    int seconds;
    int minutes;
    int hours;

// Конструктор
    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

// Метод, который возвращает общее количество секунд
    int getTimeInSec(){
        int totalTimeInSec = seconds + (minutes * 60) + ((hours * 60) * 60);
        System.out.println(totalTimeInSec);
        return totalTimeInSec;
    }
}