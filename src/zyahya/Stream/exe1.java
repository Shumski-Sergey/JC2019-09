package zyahya.Stream;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class exe1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(br.readLine());
        String string = "";
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        int[] count = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            count[i] = 0;
            for (int a = 0; a < list.size(); a++) {
                if (list.get(i) == list.get(a)) count[i]++;
            }
        }
        int minimum = Integer.MIN_VALUE;
        for (int h : count) {
            if (h > minimum) minimum = h;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i)) && count[i] == minimum) list1.add(list.get(i));
        }
        for (int y : list1) {
            string = y + " ";
        }
        System.out.println(string);
        br.close();
        inputStream.close();

    }

}

