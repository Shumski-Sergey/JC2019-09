package ssivko.lab4;

public class TaskA1 {
    public static void main(String[] args) {
        int r,t,j;
        t=1000;
        j=1;
        while (t<10000){
            t+=3;
            j++;
        }
        r=j;
        int s[] = new int[r-1];
        int i=1000;
        s[0]=1000;
        for (int p =1; p<r-1; p++){
            i+=3;
            s[p]=i;

        }
        for (int p =0; p<r-1; p++){
            System.out.print(s[p]+" ");
        }
    }
}
