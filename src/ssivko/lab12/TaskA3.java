package ssivko.lab12;

import java.util.Arrays;
import static ssivko.Ulils.callString;

public class TaskA3 {
    public static void main(String[] args) {
        System.out.println("Введите массив чисел, букв!");
        String text [] = callString();
        Arrays.stream(text).filter(s -> s.matches("\\d+")).forEach(System.out::println);
    }
}
