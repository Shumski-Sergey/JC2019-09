package yKuzMinskij.Lab1;

public class TaskB1 {
    public static void main (String[] args) {
        int i = 5 + (int) (Math.random() * 155);
        if (i>=25 && i<=100) {
            System.out.println("Случайное число " + i +" находится в диапазоне 25-100");
        }else System.out.println("Случайное число " + i + " не находится в диапазоне 25-100");
    }
}
