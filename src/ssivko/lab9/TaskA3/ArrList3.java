package ssivko.lab9.TaskA3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ArrList3 {
    public static void main(String[] args) {
        System.out.println("Ввведите количество оценок: ");
        Scanner number = new Scanner(System.in);
        int h1 = number.nextInt();

        ArrayList<Integer> rating = new ArrayList<>();
        RandomMethod(rating, h1);
        System.out.println("Список оценок: ");

        printRating(rating);
        iteratorMethod(rating);


        System.out.println("\nСамая высокая оценка: " +iteratorMethod(rating));


    }

    private static Integer iteratorMethod(ArrayList<Integer> rating) {
        Iterator<Integer> iterator = rating.iterator();
        Integer max = 0;
        while (iterator.hasNext()){
            Integer numIter = iterator.next();
            if (numIter > max){
                max = numIter;
            }
        }
        return max;
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
