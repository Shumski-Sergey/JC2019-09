package zyahya.OOP;

import java.util.Scanner;

//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
public class TimeInterval {
    private int hour;
    private int minute;
    private int second;

    public TimeInterval(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    public TimeInterval(int allSecond) {
        second = allSecond;
    }

    public int returnAllSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public void printAllTime() {
        System.out.println("First object(only second ) = " + second);
    }

    public void printDividedTime() {
        System.out.println(String.format("The second object have %s hours , %s minutes , %s seconds", hour, minute, second));
    }

    public void compareTime() {
        if (this.second >= this.returnAllSeconds()) {
            System.out.println("The first object is bigger or equals to the second object");
        } else {
            System.out.println("The first object is smaller than the second object");
        }
        this.returnAllSeconds();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        int time1 = input.nextInt();
        TimeInterval object1 = new TimeInterval(time1);
        TimeInterval object2 = new TimeInterval(18 , 54 , 5);
        object1.printAllTime();
        object2.printDividedTime();
        object2.compareTime();

    }
}