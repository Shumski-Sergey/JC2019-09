package asenyuk.Lesson5.List1;



public class  Lesson5Task4 {
    public static void main(String[] args) {

        String str = "abcd aabc abbb ddff ddddd dd";
        int res=0;
        String [] array1 = str.split(" ");
        int arra3 [] =new int[array1.length];

        for (int i=0;i<array1.length; i++) {
            System.out.println(array1[i]);

            int h=0;
            for (int n=0;n<array1.length;n++) {
                String[] array2=array1[i].split("");
                //  System.out.println(array2[n]);
                System.out.println( "++++++++++++" );
                for (int z=0; z<array2.length;z++ ) {

                    for (int j=0; j<array2.length;j++) {
                        //   System.out.println( "------------" );
                        System.out.println( array2[z]   +"   " +array2[j]  +"  "+ "z = " +z +"  "+ "j= "+j);
                        // System.out.println( "------------" );
                        // if (z==j) continue;
                        //if (  (array2[z] == array2[j]))
                        if ((z!=j)&  (array2[z].equals( array2[j])) )
                        {
                            h = h + 1;
                            //  System.out.println("h =" +h);
                            System.out.println("*******");

                        }
                        System.out.println("h =" +h);
                    }

                }
                // System.out.println("h =" +h);

            }
            res=h;
            // System.out.println("#######################");
            //System.out.println(h);
            arra3[i]=res;
            // System.out.println("#######################");
        }
        for (int x=0;x<arra3.length;x++) {
            System.out.println("!!!!!!");
            System.out.println(arra3[x]);
        }
    }
}