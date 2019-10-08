package ssivko.lab4;

public class TaskA1 {
    public static void main(String[] args) {
        int r, p;
        r=10000/3;
        int s[] = new int[r];
        p=0;
        for (int i =1000; i<10000; i+=3){
            s[p]=i;
            System.out.print(s[p]+" ");
        }
    }
}
