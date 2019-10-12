package nsivko.lab4;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int[] ch = new int[100];
        ch[0] = 1;
        for( int j = 1; j < 100; j++){
            a += 2;
            ch[j] = a;
        }
        System.out.print("Первые 55 элементов последовательности:\n1");
        for(int j = 1; j < 55; j++){
            System.out.print(" " + ch[j]);
        }
    }
}
