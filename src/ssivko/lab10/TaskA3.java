package ssivko.lab10;

import java.util.HashMap;
import java.util.Map;
import static ssivko.Ulils.*;

public class TaskA3 {
    public static void main(String[] args) {
        System.out.println("Введите любое количество слов через пробел: ");
        String[] set = scannerText();
        Map<String, String> map = new HashMap<>();
        conversion(set, map);
        System.out.println("Список анаграмм: ");
        printMap(map);
    }

}
