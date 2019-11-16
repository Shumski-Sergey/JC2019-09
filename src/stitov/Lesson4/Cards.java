package stitov.Lesson4;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by user on 05.10.2019.
 */
public class Cards {
  public static void main (String[] args){
    String card[] = setting();
    int n;
    System.out.print("Введите кол-во человек: ");
    n = getting();
    String cardn[] = generating(n, card);
    printing(n,cardn);
  }
  public static int getting(){
    Scanner in = new Scanner(System.in);
    int a;
    do {
      a = in.nextInt();
      if (a>10){
        System.out.println("Введите число меньше 11");
      }
    } while (a>10);
    return a;
  }
  public static String[] generating (int n, String card[]){
  int array[] = new int[52];
  String newcard[] = new String[52];
  int a;
  Random rand = new Random();
  array[0] = -1;
  for (int i = 0 ; i<5*n;i++){
    a = 0;
    while (a==0) {
      a = rand.nextInt(52)+1;
      for (int j =0; j<i+1;j++){
        if (array[j] == a){
          a=0;
        }
      }
    }
    newcard[i] = card[a-1];
    array[i] = a;
  }
  return newcard;
  }
  public static void printing (int n, String cardn[]){
    for (int i =0; i<n*5;i++){
    System.out.print(cardn[i]+";  ");
    if (i%5==4){
      System.out.println();
    }

    }
  }

  public static String[] setting() {
    String array[] = new String[52];
    array[0] = "2 червы";
    array[1] = "3 червы";
    array[2] = "4 червы";
    array[3] = "5 червы";
    array[4] = "6 червы";
    array[5] = "7 червы";
    array[6] = "8 червы";
    array[7] = "9 червы";
    array[8] = "10 червы";
    array[9] = "валет червы";
    array[10] = "дама червы";
    array[11] = "король червы";
    array[12] = "туз червы";
    array[13] = "2 пики";
    array[14] = "3 пики";
    array[15] = "4 пики";
    array[16] = "5 пики";
    array[17] = "6 пики";
    array[18] = "7 пики";
    array[19] = "8 пики";
    array[20] = "9 пики";
    array[21] = "10 пики";
    array[22] = "валет пики";
    array[23] = "дама пики";
    array[24] = "король пики";
    array[25] = "туз пики";
    array[26] = "2 бубны";
    array[27] = "3 бубны";
    array[28] = "4 бубны";
    array[29] = "5 бубны";
    array[30] = "6 бубны";
    array[31] = "7 бубны";
    array[32] = "8 бубны";
    array[33] = "9 бубны";
    array[34] = "10 бубны";
    array[35] = "валет бубны";
    array[36] = "дама бубны";
    array[37] = "король бубны";
    array[38] = "туз бубны";
    array[39] = "2 трефы";
    array[40] = "3 трефы";
    array[41] = "4 трефы";
    array[42] = "5 трефы";
    array[43] = "6 трефы";
    array[44] = "7 трефы";
    array[45] = "8 трефы";
    array[46] = "9 трефы";
    array[47] = "10 трефы";
    array[48] = "валет трефы";
    array[49] = "дама трефы";
    array[50] = "король трефы";
    array[51] = "туз трефы";
    return array;
    }
}
