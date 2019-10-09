package asenyuk;

public class Lesson4Task3a {

    public static void main(String[] args) {
       // int[] mas = {11, 44, 55, 42, 34, 21, 9, 53, 88};
        int f = (int) (Math.random()*10 + 2);
    //  System.out.println(f);

        int mas []=new int[f];

        for (int z=0;z<mas.length;z++) {
           mas[z]=(int) (Math.random()*10);
        }
        for (int s=0;s<mas.length;s++) {
            System.out.println(mas[s] + " ");

        }
   System.out.println("-----");

    int i=0;
    int j=mas.length-1;
    int buff=0;
    while (i<j) {
        buff= mas[i];
        mas[i]= mas[j];
        mas[j]=buff;
        i=i+1;
        j=j-1;

    }
for ( int z=0;z<mas.length;z++ ) {
    System.out.print(mas[z]+ " ");
}

    }
}
