package vtafeliuk.Lesson4;

import java.util.Scanner;

//Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143
public class TaskB1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int a = sc.nextInt();
        String s = Integer.toString(a);

        s = s.replaceAll("(\\d{1,3}(?=(?:\\d\\d\\d)+(?!\\d)))", "$1" + ' ');
        System.out.println(s);
    }
}
