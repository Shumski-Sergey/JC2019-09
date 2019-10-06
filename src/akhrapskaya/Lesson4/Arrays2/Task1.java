package akhrapskaya.Lesson4.Arrays2;

import akhrapskaya.Lesson4.Arrays.MyArrays;

public class Task1 {
    public static void  main(String[] args){
        MyArrays ar = new MyArrays("Введите количество оценок(0 -20):");
        set(ar);
        System.out.println("Максимальная оценка с индексом: " + ar.maxInd());
    }
    private static void set(MyArrays ar){
        boolean n = true;
        do{
            n = true;
            ar.setIn("Введите оценки:");
            for (int i = 0; i < ar.n; i++) {
                if (ar.array[i] < 0 || ar.array[i] > 10) {
                    n = false;
                    System.out.println("Неверный ввод! Оценки по десятибальной шкале!");
                    break;
                }
            }
        }  while (!n);
    }
}
