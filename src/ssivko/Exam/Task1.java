package ssivko.Exam;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[]{2, 2, 45, 55, 234, 23, 56, 322};
        int min = Arrays.stream(mass)
                .min().getAsInt();
        System.out.println("Минимальное значение: " + min);

        int max =  Arrays.stream(mass)
                .max().getAsInt();
        System.out.println("Максимальное значение: " + max);

        int sum = Arrays.stream(mass)
                .reduce(0, (acc, x) -> acc + x);
        System.out.print("Сумма элементов без max и min значений: ");
        System.out.println(sum - max - min);
    }
}
