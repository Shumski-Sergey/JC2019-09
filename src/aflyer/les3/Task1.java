package aflyer.les3;
// немного не то

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Нажмите любую клавишу для начала вывода");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        for (int i = 1; i <= 9; i++)
            for (int j = 0; j <= 9; j++)
                for (int k = 0; k <= 9; k++)
                    for (int l = 0; l <= 9; l++)
                        System.out.print(i + "" + j + "" + k + "" + l + " ");
    }
}
