package AlexandraShokhan.lesson12;

// 2.Станция Небула-1 принимает звездолёты только по нечётным дням стандартного земного года (когда количество дней с
// начала года — нечётно). Выясним, можем ли мы сегодня отдохнуть на Небуле-1. Для этого реализуем метод
// isDateOdd(String date), возвращающий true, если количество дней с начала года — нечётное число, иначе false.

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        boolean DoesNebula1Work = isDateOdd(calendar);
        if (DoesNebula1Work) {
            System.out.println("We can travel to Nebula-1 because it's an even day.");
        } else {
            System.out.println("We cannot travel to Nebula-1 because it's an odd day.");
        }
    }

    public static boolean isDateOdd(Calendar calendar) {
        int dayNumber = calendar.get(Calendar.DAY_OF_YEAR);
        if (dayNumber % 2 == 0) {
            return false;
        } else
            return true;
    }
}
