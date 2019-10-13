package AlexandraShokhan.lesson6;

// 1.Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.

public class Time {
    public static void main(String[] args) {
        TimeInterval day = new TimeInterval();
        day.hours = 24;
        int secInDay = day.getTimeInSec();

        TimeInterval hour = new TimeInterval();
        hour.minutes = 60;
        int secInHour = hour.getTimeInSec();

        TimeInterval minute = new TimeInterval();
        minute.seconds = 60;
        int secInMinute = minute.getTimeInSec();
    }

}

class TimeInterval{
    int seconds;
    int minutes;
    int hours;

    int getTimeInSec(){
        int totalTimeInSec = seconds + (minutes * 60) + ((hours * 60) * 60);
        System.out.println(totalTimeInSec);
        return totalTimeInSec;
    }
}