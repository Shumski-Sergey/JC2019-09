package ssivko.lab3;

public class TaskB1 {
    public static void main(String[] args) {
        int f=1, n =4;
        for (int i = 1;i <= n; i++){
            f *= i;
        }
        System.out.println("Факториал числа: " +n+ " равен: " +f);
    }

}
