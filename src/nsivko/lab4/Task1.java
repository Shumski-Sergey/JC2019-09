package nsivko.lab4;

public class Task1 {
    public static void main(String[] args) {
        int a = 1000, i = 1;
        int b = a;
        while( a < 10000){
            a += 3;
            i++;
        }
        int[] ch = new int[i-1];
        ch[0] = b;
        for( int j = 1; j < i-1; j++){
            b += 3;
            ch[j] = b;
        }
        System.out.print(ch[0]);
        for(int j = 1; j < i-1; j++){
            System.out.print(" " + ch[j]);
        }
    }
}
