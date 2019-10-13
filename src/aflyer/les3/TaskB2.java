package aflyer.les3;

import java.util.Random;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        String suit [] = {"\u2666","\u2660","\u2663","\u2665"};
        String koloda [][] = {{"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"},
                {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"},
                {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"},
                {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}};

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество игроков");
        int kolvo = sc.nextInt();
        if (((5*kolvo)%54)>5){
        for (int i=1; i<=kolvo; i++){
            System.out.print("У "+ i +"ого игрока выпала следующая колода: ");
            for (int j=1; j<=5; j++) {
                
                while (true) {
                    Random m = new Random();
                    Random k = new Random();
                    int mast = m.nextInt(4);
                    int karta = k.nextInt(13);
                    if (koloda [mast][karta]!=""){
                        System.out.print(suit[mast]+koloda[mast][karta] + " ");
                        koloda[mast][karta] ="";
                        break;
                    }
                }
            }
            System.out.println("");
        }}
        else System.out.println("Карт на всех не хватит!");


}}
