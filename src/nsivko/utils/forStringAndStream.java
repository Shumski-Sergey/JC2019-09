package nsivko.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class forStringAndStream {
    private static final int SIZE = 10;

    public static String[] getStrings() {
        System.out.print("Введите слова через пробел: ");
        Scanner text = new Scanner(System.in);
        return text.nextLine().split(" +");
    }

    public static String createString() {
        Scanner fileName = new Scanner(System.in);
        return fileName.nextLine();
    }

    public static void printMax(String name) throws IOException {
        HashMap<Byte, Integer> map = createMap(name);
        System.out.println(map);
        int max = searchMax(map);
        System.out.println(max);
        int i = 0;
        for (Integer value : map.values()) {
            if (value == max) {
                i++;
                System.out.println(i + ". встречается " + value + " раз.");
            }
        }
    }

    private static HashMap<Byte, Integer> createMap(String name) throws IOException {
        FileInputStream file = new FileInputStream(name);
        HashMap<Byte, Integer> map = new HashMap<>();
        try {
            byte[] bytes = new byte[SIZE];
            while ((file.read(bytes)) != -1) {
                putMap(map, bytes);
            }
            file.close();
        } catch (Exception e){
            file.close();
            System.out.println(e.getMessage());
        }
        return map;
    }

    private static void putMap (HashMap<Byte, Integer> map, byte[] bytes) {
        int j = 1;
        for (byte aByte : bytes) {
            Integer value = (int) aByte;
            if (value == null) {
                map.put(aByte, j);
            } else {
                map.put(aByte, j++);
            }
        }
    }

    private static Integer searchMax(HashMap<Byte, Integer> map) {
        int max = 0;
        for (Integer value:map.values()) {
            if (max < value) max = value;
        }
        return max;
    }
}
