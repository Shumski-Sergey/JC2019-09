package tereshko.Lesson4;

public class Test2 {
    public static void main(String[] args) {
        int a[]=new int [22];
        a[0]=2;
        for (int i = 1; i <a.length-1 ; i++) {
            a[i]=a[i-1]*2;
System.out.println(a[i-1]+" "+i);
        }
    }
}
