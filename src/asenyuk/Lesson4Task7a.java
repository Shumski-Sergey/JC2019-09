package asenyuk;

public class Lesson4Task7a {

    public static void main(String[] args) {


        int j = 0;
        for (int i = 90; i >= 0; i = i - 5) {
            // System.out.println(i);
            j = j + 1;

        }
        // System.out.println("j" + j);

        int mass[] = new int[j];
        int t = 90;
        for (int s = 0; s < mass.length; s++) {
            mass[s] = t;
            t = t - 5;
        }

        for (int z = 0; z < mass.length; z++) {
            System.out.println(mass[z]);
        }
    }
}
