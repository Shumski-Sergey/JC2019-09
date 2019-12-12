package kushakov.Lesson9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Числа");
        Scanner www = new Scanner(System.in);
        String ww = www.nextLine();
        Set<String> st = new HashSet<String>();
        st.addAll(Arrays.asList(ww.split("")));
        System.out.println(st);



    }
}
