package nbogdan.PokerStarsRemake;

import java.util.Scanner;

class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет, давай сыграем в покер?");
        if (Check.answer(sc.nextLine())) System.out.print("збс");
    }
}
