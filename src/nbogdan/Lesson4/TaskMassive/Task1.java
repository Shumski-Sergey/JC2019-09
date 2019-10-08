package nbogdan.Lesson4.TaskMassive;

import java.util.Scanner;

public class Task1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество учеников");
        int[] mass = setIntData();
        System.out.println(mass.length);
    }
    private static boolean validate(int a) {
        if (a > 0 && a <= 1000) {return  true;}
        else {setIntData(); return false;}
    }
    private static int[] setIntData() {
        System.out.println("\nВведите количество: ");
        int a = sc.nextInt();
        if (validate(a)) {
            return new int[a];
        }
        return new int[0];
    }
}
