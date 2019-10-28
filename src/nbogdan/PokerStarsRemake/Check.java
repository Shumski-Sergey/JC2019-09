package nbogdan.PokerStarsRemake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Check {
    private static final int MINPLAYERS = 2;
    private static final int MAXPLAYERS = 10;
    private static Scanner sc = new Scanner(System.in);
    static boolean answer(String s) {
        Pattern p = Pattern.compile("[dDдД][aAаА]|(yes|YES)|[yY]|[lL][fF]");
        Matcher matcher = p.matcher(s);
        return matcher.find();
    }
    static void toGo() {
        Pattern p = Pattern.compile("[dDдД][aAаА]|(yes|YES)|[yY]|[lL][fF]");
        System.out.println("Продолжим?");
        Matcher matcher = p.matcher(sc.nextLine());
        if (!matcher.find()) {
            System.out.println("Уверены, что хотите завершить выполнение программы? Ответьте да, чтобы завершить, нет, чтобы продолжить");
            matcher.reset(sc.nextLine());
            if (matcher.find()) {System.exit(0);}
        }
    }
    static int setPlayers() {
        System.out.println("Введите количество игроков от 2 до 10");
        int num = sc.nextInt();
        if (num < MINPLAYERS || num > MAXPLAYERS) {
            System.out.println("Вы ввели неверное число! Хотите попробовать еще раз?");
            if (answer(sc.nextLine())) {
                setPlayers();
            } else System.exit(0);
        }
        return num;
    }
}
