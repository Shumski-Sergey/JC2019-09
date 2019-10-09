package ssivko.lab4;

public class TaskA4 {
    public static void main(String[] args) {
        int a=2;
        int s [] = new int[50];
        s[0]=2;
        for (int i=1; i<50; i++){
            a*=2;
            s[i]=a;
        }
        for(int i = 0; i < 20; i++){
            System.out.print(" " + s[i]);
        }
    }
}
