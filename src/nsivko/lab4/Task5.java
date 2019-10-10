package nsivko.lab4;

public class Task5 {
    public static void main(String[] args) {
        int a = 2;
        int[] ch = new int[20];
        ch[0] = 2;
        for( int j = 1; j < 20; j++){
            a = 2*a - 1;
            ch[j] = a;
        }
        System.out.print("Элементы последовательности:\n2");
        int j = 1;
        while(ch[j] < 10000){
            System.out.print(" " + ch[j]);
            j++;
        }
    }
}
