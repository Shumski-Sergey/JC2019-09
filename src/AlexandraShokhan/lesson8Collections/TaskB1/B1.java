package AlexandraShokhan.lesson8Collections.TaskB1;

// B1.Имеется текст. Следует составить для него частотный словарь

import java.io.*;
import java.util.*;
import static AlexandraShokhan.Utils.*;


public class B1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/AlexandraShokhan/lesson8Collections/TaskB1/input.txt";
        String content = new Scanner(new File(path)).useDelimiter("\\Z").next();
        List<String> wordsList = new ArrayList<>(Arrays.asList(content.split("(\\s|\\.|\\,)+")));

        stringListToLowerCase(wordsList);

        Map<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < wordsList.size(); i++) {
            treeMap.put(wordsList.get(i), calculateFrequency(wordsList, i));
        }

        treeMap = sortByValues(treeMap);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static int calculateFrequency(List<String> wordsList, int index) {
        int counter = 1;
        String word = wordsList.get(index);
        for (int i = index; i < wordsList.size() - 1; i++) {
            if (word.equals(wordsList.get(i + 1))) {
                counter++;
            }
        }
        for (int i = index; i > 0; i--) {
            if (word.equals(wordsList.get(i - 1))) {
                counter++;
            }
        }
        return counter;
    }

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator = (k1, k2) -> {
            int compare = map.get(k2).compareTo(map.get(k1));
            if (compare == 0) return 1;
            else return compare;
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}