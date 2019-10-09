package ssivko.lab4;

public class TasKA2 {
    public static void main(String[] args) {
        int r,t,j,f;
        t=1;
        j=1;
        r=1+(55*2);
        while (t<r){
            t+=2;
            j++;
        }
        f=j;
        int s[] = new int[f-1];
        int i=1;
        s[0]=1;
        for (int p =1; p<f-1; p++){
            i+=2;
            s[p]=i;

        }
        for (int p =0; p<f-1; p++){
            System.out.print(s[p]+" ");
        }
    }
}