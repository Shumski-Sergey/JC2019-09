package balexej.Test1;

public class Task3 {
    public static void main(String[]args){
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++){
            a [i] =(int) Math.round ( Math.random() * 10 ) ;
            System.out.println(a[i]);
        }
        int[] a2 = new int[a.length];
        for (int b = 0; b <= a.length -1; b++){
            for (int c = 0; c <= a.length-1; c++) {
                if (a[b] == a[c])
                    a2[b]++;
            }
        }

        int max = 0;
        for (int a3 = 0; a3 <= a.length-1; a3++){
            if (a2[a3] > max)
                max = a2[a3];
        }
        System.out.println("Самое повторяющееся число: " + a2[max] + "\n" + "Число повторов: " + max + " раз");
    }
}



