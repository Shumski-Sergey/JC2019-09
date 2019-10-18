package nbogdan.Lesson5.TaskA;

import java.util.Scanner;

public class TaskA4 {
    static int nymOfSym(String word) {
        char[] arrWord = word.toCharArray();
        StringBuilder wordWithoutSame = new StringBuilder(String.valueOf(arrWord[0]));
        for (int i = 1; i < word.length(); i++) {
            if (!wordWithoutSame.toString().contains(String.valueOf(arrWord[i]))) {
                wordWithoutSame.append(arrWord[i]);
            }
        }
        return wordWithoutSame.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько слов введем?");
        String[] mass = new String[sc.nextInt()];
        int[] numOfSym = new int[mass.length];
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите " + (i + 1) + " слово:");
            mass[i] = sc.next();
            numOfSym[i] = nymOfSym(mass[i]);
            if (numOfSym[i] < minSum) {minSum = numOfSym[i];}
        }
        for (int i = 0; i < numOfSym.length; i++) {
            if (numOfSym[i] == minSum) {
                System.out.println("Первое слово с минимальным количеством символов: " + mass[i] + "\nУникальных символов: " + numOfSym[i]);
                break;
            }
        }
    }
}
