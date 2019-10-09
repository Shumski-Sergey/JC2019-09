package asenyuk;

public class Lesson4Task1a {
    public static void main(String[] args) {
        int [] mas ={11,44,55,42,34,21,9,53,88};
        int min=mas[0];

        for (int a=0;a<mas.length;a++) {
            if (mas[a] < min) {
                min=mas[a];
            }
        }
        System.out.println("min = " + min);
int indxMin=0;
        for (int b=0;b<mas.length;b++) {
            if (mas[b]==min) {
                indxMin=  b;
            }
        }
        System.out.println("min index array = " + indxMin);
    }
}
