package nsivko.lab4;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskMB1 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner str = new Scanner(System.in);
        String stroka = str.nextLine();
        Pattern zn = Pattern.compile("[.?!;,:]+");
        Matcher m = zn.matcher(stroka);
        int ch = 0;
        while(m.find()){
            ch++;
        }
        System.out.println("Общее количество знаков препинания: " + ch);
    }
}
