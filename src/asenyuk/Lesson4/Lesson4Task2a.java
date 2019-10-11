package asenyuk.Lesson4;

public class Lesson4Task2a {
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
        // max

        int max=mas[0];

        for (int x=0;x<mas.length;x++) {
            if (mas[x] > max) {
                max=mas[x];
            }
        }
        System.out.println("max = " + max);
        int indxMax=0;
        for (int y=0;y<mas.length;y++) {
            if (mas[y]==max) {
                indxMax=  y;
            }
        }
        System.out.println("max index array = " + indxMax);
int sum=0;
        for (int z=indxMin;z<=indxMax;z++){
    sum=sum + mas[z];
}
        System.out.println("sum = " + sum);
    }
}
