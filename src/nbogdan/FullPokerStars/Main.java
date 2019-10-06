package nbogdan.FullPokerStars;

import java.util.Scanner;
/* created by PizzaDog 05.06.2019
*
* update 0.8:
* Компьютер раздает карты из 1 колоды максимум на 10 игроков (по классике Texas Holdem)
* Последовательность игры:
* - задать количество игроков
* - дать игрокам имена
* - 1 раздача: по 2 карты игрокам
* - 2 раздача: флоп + показать карты игроков
* - 3 раздача: терн + показать карты игроков
* - 4 раздача: ривер + показать карты игроков
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте! Хотите поиграть в покер?");
        String s = sc.nextLine();
        if (Check.answer(s)) {
            System.out.println("Отлично! На данный");
        }
        else System.out.println("Ну и идите отсюда");
    }
}
