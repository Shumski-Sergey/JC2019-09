package AlexandraShokhan;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Utils {

    /**
     * @param min set the min value to be generated.
     * @param max set the max value to be generated.
     * @return Returns a random int value within the range [min; max].
     */
    public static int getRandomNum(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    /**
     * @param length   set the length of ArrayList<Integer>
     * @param minValue set the min value
     * @param maxValue set the max value
     * @return Returns an ArrayList of randomly selected Integer values within the range [min; max].
     */
    public static ArrayList<Integer> createRandomArrayList(int length, int minValue, int maxValue) {
        ArrayList<Integer> randomArray = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            randomArray.add(getRandomNum(minValue, maxValue));
        }
        return randomArray;
    }

    /**
     * @param length   set the length of LinkedList<Integer>
     * @param minValue set the min value
     * @param maxValue set the max value
     * @return Returns a LinkedList of randomly selected Integer values within the range [min; max].
     */
    public static LinkedList<Integer> createRandomLinkedList(int length, int minValue, int maxValue) {
        LinkedList<Integer> randomArray = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            randomArray.add(getRandomNum(minValue, maxValue));
        }
        return randomArray;
    }

    /**
     * @param anyList       is a List of Integer values.
     * @param numberOfTimes is the number of times this method should randomly select a value from the list.
     */
    public static void getRandomNTimes(List<Integer> anyList, int numberOfTimes) {
        Random getRandom = new Random();
        for (int i = 1; i <= numberOfTimes; i++) {
            anyList.get(getRandom.nextInt(anyList.size()));
        }
    }

    /**
     * @param anyList       is a List of Integer values.
     * @param numberOfTimes is the number of times this method should randomly select a value from the list.
     * @return the time the operation took in milliseconds.
     */
    public static long calculateOperationTime(List<Integer> anyList, int numberOfTimes) {
        long startTime = System.currentTimeMillis();
        getRandomNTimes(anyList, numberOfTimes);
        long finishTime = System.currentTimeMillis();
        return finishTime - startTime;
    }

    /**
     * @param arrayList is an ArrayList of Integer values.
     * @return the max value found in the ArrayList of Integer values.
     */
    //TODO iterator!
    public static int getMaxIntInArrayList(ArrayList<Integer> arrayList) {
        int max = 0;
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int var = iterator.next();
            while (var > max) {
                max = var;
            }
        }
        return max;
    }

    /**
     * @param list is a List of Strings.
     * @return the List of Strings all in lower case.
     */
    public static List<String> stringListToLowerCase(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toLowerCase());
        }
        return list;
    }

    /**
     * @param word is a String value.
     * @return String which contains the letters of the word in alphabetic order.
     */
    public static String wordToAlphabeticOrder(String word) {
        char[] wordToSymbols = word.toCharArray();
        Arrays.sort(wordToSymbols);
        String wordInAlphabeticOrder = new String(wordToSymbols);
        return wordInAlphabeticOrder;
    }

    /**
     * @param list is a List collection of values.
     * @param <T>  String or Integer
     */
    public static <T> void printList(List<T> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    /**
     * @param set is a Set collection of Strings.
     * @return Converts Set to ArrayList with the same Strings in it.
     */
    public static ArrayList<String> convertSetToArrayList(Set<String> set) {
        List<String> arrayList = new ArrayList<>();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            arrayList.add((String) iterator.next());
        }
        return (ArrayList<String>) arrayList;
    }

    public static <T> void printHashMap(Map<Integer, Integer> hashMap) {
        hashMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }

    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
        return map.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
