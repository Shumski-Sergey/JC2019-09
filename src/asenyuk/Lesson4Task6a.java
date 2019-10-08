package asenyuk;
//
public class Lesson4Task6a {
    public static void main(String[] args)
    {
        int n=55;
        int r=1;
        int masss []=new int [n-1];
        for (int j=0;j<masss.length;j++) {
            masss[j]=r;
            r=r+2;

        }
        for (int z=0; z<masss.length;z++ ){
            System.out.println(masss[z]);
        }

    }
}
