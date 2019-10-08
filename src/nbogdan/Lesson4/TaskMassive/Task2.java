package nbogdan.Lesson4.TaskMassive;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt(), sum = 0;
        int[] mass = new int[size];
        System.out.println("Теперь заполните массив");
        for (int i = 0; i < mass.length ; i++) {
            mass[i] = sc.nextInt();
            sum += mass[i];
        }
        sum -= mass[0] + mass[mass.length - 1];
        System.out.println("Сумма всех элементов кроме " + mass[0] + " и " + mass[mass.length - 1] + " = " + sum);
    }
}
