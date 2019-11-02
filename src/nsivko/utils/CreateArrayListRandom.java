package nsivko.utils;

import java.util.*;

public class CreateArrayListRandom {
    private static final int MIN_POSITIVE_NUMBER = 40;
    private static final int MAX_NUMBER = 100;
    private static final int SEARCH_NUMBER = 10000;
    private static final int NUMBER_TAP = 1000000;

    public static ArrayList<Integer> createArrayNumber(int lenght) {
        ArrayList<Integer> arrayNumber = new ArrayList<>();
        for(int i = 0; i < lenght; i++) {
            int random = (int) (Math.random() * MAX_NUMBER);
            arrayNumber.add(random);
     }
        return arrayNumber;
    }

    public static List<Integer> createNumberRandom(List<Integer> arrayNumber, int lenght) {
        for(int i = 0; i < lenght; i++) {
            Random randomBig = new Random();
            int random = randomBig.nextInt();
            arrayNumber.add(random);
        }
        return arrayNumber;
    }

    public static void tapRandomNumberList(List<Integer> numberList) {
        for (int i = 0; i < SEARCH_NUMBER; i++) {
            int random = (int) (Math.random() * NUMBER_TAP);
            numberList.get(random);
        }
    }

    public static void removeNegativeElements(ArrayList<Integer> assessmentArray) {
        for(int i = 0; i < assessmentArray.size(); i++) {
            if (assessmentArray.get(i) < MIN_POSITIVE_NUMBER) {
                assessmentArray.remove(i);
                i--;
            }
        }
    }

    public static void removeSameElements(ArrayList<Integer> assessmentArray) {
        for(int i = 0; i < assessmentArray.size(); i++) {
            for (int j = i+1; j < assessmentArray.size(); j++) {
                if (assessmentArray.get(i).equals(assessmentArray.get(j))) {
                    assessmentArray.remove(j);
                    j--;}
            }
        }
    }

    public static void printArrayNumber(ArrayList<Integer> arrayNumber) {
        System.out.print(arrayNumber.get(0));
        for(int i = 1; i < arrayNumber.size(); i++) {
            System.out.print(", " + arrayNumber.get(i));
        }
    }

    public static int getStudentNumber() {
        Scanner size = new Scanner(System.in);
        return size.nextInt();
    }

    public static String[] createWordsFromText() {
        Scanner size = new Scanner(System.in);
        String text = size.nextLine();
        text = text.toLowerCase();
        return text.split(" +");
    }

    public static Integer maxElements(ArrayList<Integer> assessmentArray) {
        Iterator<Integer> iterator = assessmentArray.iterator();
        Integer max = 0;
        while (iterator.hasNext()) {
            Integer numberIterator = iterator.next();
            if (numberIterator > max) {
                max = numberIterator;
            }
        }
        return max;
    }

    public static void printHashMapValues(Map<String, String> listWords) {
        for (String k : listWords.values()) {
            System.out.print("\n" + k);
        }
    }

    public static Map<String, String> getListWords(String[] words) {
        Map<String, String> listWords = new HashMap<>();
        for (String word : words) {
            char[] symbolsWord = word.toCharArray();
            Arrays.sort(symbolsWord);
            String wordNew = new String(symbolsWord);
            String value = listWords.get(wordNew);
            if (value == null) {
                listWords.put(wordNew, word);
            } else {
                listWords.put(wordNew, value + " " + word);
            }
        }
        return listWords;
    }
}
