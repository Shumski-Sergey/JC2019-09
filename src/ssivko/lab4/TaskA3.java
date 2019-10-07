package ssivko.lab4;

public class TaskA3 {
    public static void main(String[] args) {
        int a,b,i,f;
        b=90/5;
        a=b;
        int s[] = new int[a];
        for (i=90; i>=0; i-=5){
            f=0;
            s[f]=i;
            System.out.print(s[f]+" ");
        }
    }
}
