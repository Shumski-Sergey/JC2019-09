package AlexandraShokhan.lesson5;

// 3. Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some text:");
        String text = in.nextLine();

        String[] array = text.split("(\\s|\\.|\\,)+");
        String str;
        for (int i = 0; i <= array.length - 1; i++) {
            str = array[i].substring(array[i].length() - 1);
            System.out.print(str);
        }
    }
}
