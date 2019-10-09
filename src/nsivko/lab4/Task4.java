package nsivko.lab4;

public class Task4 {
    public static void main(String[] args) {
        int a = 2;
        int[] ch = new int[100];
        ch[0] = 2;
        for( int j = 1; j < 100; j++){
            a *= 2;
            ch[j] = a;
        }
        System.out.print("Первые 20 элементов последовательности:\n2");
        for(int j = 1; j < 20; j++){
            System.out.print(" " + ch[j]);
        }
    }
}
