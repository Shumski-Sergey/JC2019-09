package nsivko.lab5;

import java.util.Scanner;

public class TaskSBR5 {
    public static void main(String[] args) {
        System.out.println("Введите количество строк: ");
        Scanner kolst = new Scanner(System.in);
        int n = kolst.nextInt();
        System.out.println("Введите строки: ");
        Scanner str = new Scanner(System.in);
        String[] stroki = new String[n];
        char[] glas = {'a','A','o','O','e','E','i','I','u','U','y','Y'};
        for(int i = 0; i < n; i++){
            stroki[i] = str.nextLine();
        }
        System.out.println("Слова,содержащие символы только латинского алфавита: ");
        boolean prov = true;
        int[] index_lat = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < stroki[i].length(); j++){
                if((stroki[i].charAt(j) >= 'А' && stroki[i].charAt(j) <= 'Я') || (stroki[i].charAt(j) >= 'а' && stroki[i].charAt(j) <= 'я') || (stroki[i].charAt(j) >='0' && stroki[i].charAt(j)<='9')){
                    prov = false;
                    break;
                }
                prov = true;
            }
           if(prov == true) {
               index_lat[i] = i;
               System.out.println(stroki[i]);}
        }
        for(int i = 0; i < n; i++) {
            int b1 = 0, b2 = 0;
            for (int j = 0; j < stroki[i].length(); j++) {
                boolean bb = true;
                for (int k = 0; k < glas.length; k++) {
                    if (stroki[i].charAt(j) == glas[k]) {
                        bb = false;
                    }
                }
                if (bb == false){
                    b1++;
                } else {
                    b2++;
                }
            }
            if (b1 == b2) System.out.println("В слове " + "\"" + stroki[i] + "\"" + " количество гласных букв равно количеству согласных букв.");
        }
    }
}
