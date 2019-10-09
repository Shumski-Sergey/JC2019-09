package ssivko.lab4;

public class TaskA6 {
    public static void main(String[] args) {
        int s[] = new int[20];
        int i, b=-166;
        for (i=0; i<=10; i++){
            s[i]=b;
            b=2*b+200;
            if (s[i]<100 && s[i]>10)
                System.out.print(s[i]+" ");
            if (s[i]>-100 && s[i]<-10)
                System.out.print(s[i]+" ");
        }
    }
}
