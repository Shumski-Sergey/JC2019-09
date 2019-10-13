package nsivko.lab4;

public class Task6 {
    public static void main(String[] args) {
        int a = -166;
        int[] ch = new int[1000];
        ch[0] = -166;
        for( int j = 1; j < 1000; j++){
            a = 2*a + 200;
            ch[j] = a;
        }
        System.out.print("Все двузначные элементы последовательности:\n");
        for(int j = 0; j < 1000; j++){
         if(ch[j] > (-100) && ch[j] < (-9) || ch[j] > 9 && ch[j] < 100){
             System.out.print(" " + ch[j]);
          }
        }
    }
}
