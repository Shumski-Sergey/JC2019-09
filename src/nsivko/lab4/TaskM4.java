package nsivko.lab4;

public class TaskM4 {
    public static void main(String[] args) {
        int[][] mas = {{1,1,1,1,1},{0,1,1,1,0},{0,0,1,0,0},{0,1,1,1,0},{1,1,1,1,1}};
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                System.out.print(" " + mas[i][j]);
            }
            System.out.print("\n");
        }
    }
}
