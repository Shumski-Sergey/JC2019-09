package asenyuk.Lesson4;
//
public class Lesson4Task8a {
    public static void main(String[] args) {
        int n=20;
        int r=2;
        int masss []=new int [n-1];
        for (int j=0;j<masss.length;j++) {
            masss[j]=r;
            r=r*2;

        }
        for (int z=0; z<masss.length;z++ ){
            System.out.println(masss[z]);
        }
    }
}
