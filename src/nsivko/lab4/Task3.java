package nsivko.lab4;

public class Task3 {
    public static void main(String[] args) {
        int a = 90;
        int[] ch = new int[100];
        ch[0] = 90;
        for( int j = 1; j < 100; j++){
            a -= 5;
            ch[j] = a;
        }
        System.out.print("Все неотрицательные элементы последовательности:\n90");
        int j = 1;
        while(ch[j] >= 0){
            System.out.print(" " + ch[j]);
            j++;
        }
    }
}
