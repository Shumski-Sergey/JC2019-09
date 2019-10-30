package akhrapskaya.Lesson9;

import java.io.File;

import java.util.Scanner;
import java.util.TreeMap;

public class TaskB1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> voc = new TreeMap<>();
        try {
            File file = new File("src/akhrapskaya/Lesson9/Text.txt");
            Scanner  sc = new Scanner(file);
            while(sc.hasNext()) {
                String s = sc.nextLine();
                String[] array = s.toLowerCase().split("[^a-zA-Z']+");
                for (String k: array) {
                    if(k.isEmpty())continue;
                    if (voc.containsKey(k)) {
                        voc.put(k, voc.get(k) + 1);
                    } else
                        voc.put(k, 1);
                }
            }
            System.out.println(voc);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
