package asenyuk.Lesson4;
//
import java.util.Scanner;

public class Lesson4Task1b {
    public static void main(String[] args) {
        int  amauntCard=54;
        int countCard=5;
        Scanner intpt =new Scanner(System.in);
        int n=intpt.nextInt();
      //  System.out.println("n " +n);

char cardDeck []=new char[amauntCard-1];

for (int i=0;i<cardDeck.length;i++) {
    cardDeck[i]=' ';
}
int c=0;
if (n*countCard<=amauntCard) {

    for (int x = 0; n > x; x++) {
        for (int z = 0; countCard >= z; z++) {

            System.out.print(cardDeck[c]);
            c = c + 1;
        }
        System.out.println("next player");
    }
}
else {System.out.println("Too many players");}
    }
}
