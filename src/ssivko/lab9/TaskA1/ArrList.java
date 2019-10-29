package ssivko.lab9.TaskA1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        System.out.println("Ввведите количество оценок: ");
        Scanner number = new Scanner(System.in);
        int h1 = number.nextInt();

        ArrayList<Integer> rating = new ArrayList<>();
        RandomMethod(rating, h1);
        System.out.println("Список оценок: ");

        printRating(rating);

        deleteElement(rating);
        System.out.println("\nСписок положительных оценок: ");
        printRating(rating);
    }

    private static void deleteElement(ArrayList<Integer> rating) {
        for (int i=0; i<rating.size(); i++){
            if (rating.get(i)<40){
                rating.remove(i);
                i--;
            }
        }
    }

    private static void printRating(ArrayList<Integer> rating) {
        for (int i =0; i< rating.size(); i++) {
            System.out.print(rating.get(i)+ " ");
        }
    }

    private static void RandomMethod(ArrayList<Integer> rating, int d) {
        Random random = new Random();
        for (int i =0; i<d; i++){
            rating.add(random.nextInt(100));
        }
    }




}
