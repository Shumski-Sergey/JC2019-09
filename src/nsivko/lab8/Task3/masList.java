package nsivko.lab8.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class masList {

    public static final int sizeWord = 5;
    public static final int sizeNumber = 7;

    public static void main(String[] args) {

        Checklist<String> words = new Checklist<>();
        words.setCheck(createWord());

        Checklist<Integer> numbers = new Checklist<>();
        numbers.setCheck(createNumber());

        ArrayList<Checklist<String>> arrayWord = new ArrayList<Checklist<String>>(Arrays.asList(words));

        ArrayList<Checklist<Integer>> arrayNumber = new ArrayList<Checklist<Integer>>(Arrays.asList(numbers));

       createList(arrayWord, arrayNumber);


    }

    private static void createList(List<Checklist<String>> arrayWord, List<Checklist<Integer>> arrayNumber) {
        System.out.println("Список строк: ");
        for(int i = 0; i < sizeWord; i++) {
        System.out.println(arrayWord.get(0).getCheck()[i]);
        }
        System.out.println("Список чисел: ");
        for(int i = 0; i < sizeNumber; i++) {
            System.out.println(arrayNumber.get(0).getCheck()[i]);
        }
    }

    private  static Integer[] createNumber() {
        Integer[] number = new Integer[sizeNumber];
        for (int i = 0; i < sizeNumber; i++) {
            number[i] = (int) (Math.random() * 20);
        }
        return number;
    }

    public static String[] createWord() {
        String[] word = new String[sizeWord];
        word[0] = "cat";
        word[1] = "dog";
        word[2] = "duck";
        word[3] = "chicken";
        word[4] = "goose";
        return word;
    }
}
