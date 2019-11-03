package zyahya.Strings;

public class Lines3 {
    public static void main(String args[]) {
        int word = 1;
        String text = "count number of words and spaces";

        for (int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == ' ')
                word++;
        }

        System.out.println("Number of words=" +( word + (word - 1)));
    }
}