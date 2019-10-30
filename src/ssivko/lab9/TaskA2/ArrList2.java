package ssivko.lab9.TaskA2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrList2 {
    public static void main(String[] args) {
    System.out.println("Ввведите количество случайных чисел: ");
    Scanner number = new Scanner(System.in);
    int h1 = number.nextInt();

    ArrayList<Integer> rating = new ArrayList<>();
    RandomMethod(rating, h1);
        System.out.println("Список чисел: ");

    printRating(rating);

    deleteElement(rating);
        System.out.println("\nСписок без повторов: ");
    printRating(rating);
}

    private static void deleteElement(ArrayList<Integer> rating) {
        for (int i=0; i<rating.size(); i++){
            for (int j= rating.size()-1; j>i; j-- ){
                if (rating.get(i).equals(rating.get(j))){
                    rating.remove(j);
                    j++;
                }

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


