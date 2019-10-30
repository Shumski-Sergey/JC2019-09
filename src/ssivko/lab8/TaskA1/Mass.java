package ssivko.lab8.TaskA1;

import java.util.Random;
import java.util.Scanner;

public class Mass{

    public static final int sizeInt = 5;
    public static final int sizeStr = 3;


    public static void main(String[] args) {

        Integer[] massivInt = {12, 17, 132, -54, -100};
                //massivIntOne();
        String[] massivStr = {"Ноги", "Руки", "Голова"};
                //massivStrOne();
        Demo<Integer> massivIntOne  = new Demo<>();
        massivIntOne.setItem(massivInt);

        Demo<String> massivStrOne = new Demo<>();
        massivStrOne.setItem(massivStr);

        System.out.println("Введите номер элемента массива чисел от 0 до "+ (sizeInt-1));

        Scanner scan1 = new Scanner(System.in);
        int i = scan1.nextInt();

        System.out.println("Введите номер элемента массива строк от 0 до "+ (sizeStr-1));

        Scanner scan2 = new Scanner(System.in);
        int j =scan2.nextInt();


        dubleDemo(massivIntOne, massivStrOne, i, j);


    }

    private static void dubleDemo(Demo<Integer> massivIntOne, Demo<String> massivStrOne, int i, int j) {
        System.out.print("\nВаш элемент масива чисел: " + massivIntOne.getItem()[i] + "\nВаш элемент масива строк: " + massivStrOne.getItem()[j]);
    }

}


