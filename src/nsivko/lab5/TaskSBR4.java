package nsivko.lab5;

import java.util.Scanner;

public class TaskSBR4 {
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
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < slovN[k].length() - 1; i++) {
                for (int j = i + 1; j < slovN[k].length(); j++) {
                    StringBuilder ss = new StringBuilder(slovN[k]);
                    if (slovN[k].charAt(i) == slovN[k].charAt(j)) {
                        ss.deleteCharAt(j);
                        slovN[k] = ss.toString();
                        j--;
                    }
                }
            }
        }
        int min = slovN[0].length(), Min = 0;
        for (int k = 1; k < n; k++) {
            if(min > slovN[k].length()){
                min = slovN[k].length();
            }
        }
        for (int k = 1; k < n; k++){
            if(slovN[k].length() == min){
                System.out.println("В строке " + "\"" + slova[k] + "\"" + " число различных символов минимально и равно " + min);
                break;
            }
        }

    }
}
