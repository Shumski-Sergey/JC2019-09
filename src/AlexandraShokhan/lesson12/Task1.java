package AlexandraShokhan.lesson12;

// 1. Узнать день недели и вывести его, если у нас есть дана дата в String формате или timeStamp

import java.sql.Timestamp;

public class Task1 {
    public static void main(String[] args) {
        Timestamp dateTimestamp = new Timestamp(System.currentTimeMillis());
        String date = dateTimestamp.toLocalDateTime().getDayOfWeek().toString().toLowerCase();
        System.out.println("Today is " + date + ".");
    }
}
