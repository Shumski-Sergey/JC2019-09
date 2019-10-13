package ssivko.lab4;

public class TaskA3 {
    public static void main(String[] args) {
        int a=90;
       int s [] = new int[50];
       s[0]=90;
       for (int i=1; i<50; i++){
           a-=5;
           s[i]=a+5;
       }
       int i=1;
       while (s[i]>=0){
           System.out.print(s[i]+" ");
           i++;
       }
    }
}
