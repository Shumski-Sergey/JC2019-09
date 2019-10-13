package nsivko.lab5;

import java.util.Scanner;

public class TaskSBR7 {
    public static void main(String[] args) {
        System.out.println("Введите количество слов: ");
        Scanner kolst = new Scanner(System.in);
        int n = kolst.nextInt();
        System.out.println("Введите слова: ");
        Scanner str = new Scanner(System.in);
        String[] slova = new String[n];
        for (int i = 0; i < n; i++) {
            slova[i] = str.nextLine();
        }
        String[] slovN = new String[n];
        for (int i = 0; i < n; i++) {
            slovN[i] = slova[i];
        }
        boolean prov = true;
        for (int k = 0; k < n; k++) {
            outer:
            for (int i = 0; i < slovN[k].length() - 1; i++) {
                for (int j = i + 1; j < slovN[k].length(); j++) {
                    if (slovN[k].charAt(i) == slovN[k].charAt(j)) {
                        prov = false;
                        break outer;
                    }
                    prov = true;
                }

            }
            if (prov == true) {
                System.out.println("В строке " + "\"" + slova[k] + "\"" + " все различные символы.");}
        }
    }
}
