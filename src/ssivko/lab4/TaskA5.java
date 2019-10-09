package ssivko.lab4;

public class TaskA5 {
    public static void main(String[] args) {

        int s[] = new int[20];
        int i, b=2;
        for (i=0; i<20; i++){
            s[i]=b;
            b=2*b-1;
        }
        for (i=0; i<20; i++){
            if (s[i]<10000){
                System.out.print(s[i]+" ");
            }
        }
    }
}
