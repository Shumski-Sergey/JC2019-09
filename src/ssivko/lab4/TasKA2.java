package ssivko.lab4;

public class TasKA2 {
    public static void main(String[] args) {
        int a,b,i,f;
        a=55;
        b=1+(55*2);
        int s[] = new int[a];
        for (i=1; i<=b; i+=2){
            f=0;
            s[f]=i;
            System.out.print(s[f]+" ");
        }
    }
}