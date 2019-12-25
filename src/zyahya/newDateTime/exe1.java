package zyahya.newDateTime;
// Узнать день недели и вывести его, если у нас есть дана дата в String формате или timeStamp

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class exe1 {
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("EEEE");
        Calendar calendar = new GregorianCalendar();
        System.out.println(date.format(calendar.getTime()));
    }
}
