package tereshko.Lesson4;

public class Test5_5 {
    public static void main(String[] args) {
        int[] a = new int[1000];

        for (int i = 0; i <a.length; i++) {
            a[i]=(2*(-166)*i-1+200);
        }
        int x=0;
        while (a[x]>9 && a[x]<100){
            System.out.println(a[x]);
            x++;
        }
    }
}
