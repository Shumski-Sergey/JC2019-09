package akhrapskaya.KR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в диапазоне [1-12]");
        try {

            System.out.println(new Month(sc.nextInt()).getMonth());
        } catch (InputMismatchException e) {
            System.out.println("Некорректно введены данные!");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Введено недопустимое число!");
        }
    }

}

