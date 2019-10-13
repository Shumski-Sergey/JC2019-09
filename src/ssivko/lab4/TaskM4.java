package ssivko.lab4;

public class TaskM4 {
    public static void main(String[] args) {
        int table [] [] = {
                {1,1,1,1,1},
                {0,1,1,1,0},
                {0,0,1,0,0},
                {0,1,1,1,0},
                {1,1,1,1,1}
        };
        int a,b;
        for (a=0; a<5; a++){
            for (b=0; b<5; b++){
                System.out.print(table[a][b]+" ");
            }
            System.out.println();
        }
    }
}
