package dmikulionak.lesson_4;


public class task4_massive {
    public static void main (String[] args) {
        int[][] butterfly = new int[10][10];
        int i,j;


        for (i=0;i<butterfly.length/2+1;i++){
            for (j=0;j<butterfly[i].length;j++){
                if ((j<i) || (j>=(butterfly[i].length-i)))
                    butterfly[i][j]=0;
                else
                    butterfly[i][j]=1;
            }
        }
        for (i=butterfly.length-1; i>=butterfly.length/2; i--){
            for (j=0; j<butterfly[i].length; j++){
                if ((j<(butterfly[i].length-1-i)) || (j>i))
                    butterfly[i][j]=0;
                else
                    butterfly[i][j]=1;}
        }
        for (i=0;i<butterfly.length;i++){
            for(j=0;j<butterfly[i].length;j++){
                System.out.print(butterfly[i][j]);
            }
            System.out.println(" ");
        }
    }
}
