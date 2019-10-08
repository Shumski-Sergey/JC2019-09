package ssivko.lab4;

public class TaskA4 {
    public static void main(String[] args) {
        int a,i,f,b;
        b=2000000;
        a=20;
        int s[] = new int[a];
        for (i=2; i<=b; i*=2){
            f=0;
            s[f]=i;
            System.out.print(s[f]+" ");
        }
    }
}
