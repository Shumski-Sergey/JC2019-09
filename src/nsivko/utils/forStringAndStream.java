package nsivko.utils;

import java.util.Scanner;

public class forStringAndStream {
    public static String[] getStrings() {
        System.out.print("Введите слова через пробел: ");
        Scanner text = new Scanner(System.in);
        return text.nextLine().split(" +");
    }
}
