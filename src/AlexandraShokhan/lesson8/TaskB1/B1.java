package AlexandraShokhan.lesson8.TaskB1;

// B1.Имеется текст. Следует составить для него частотный словарь

import java.io.*;
import java.util.*;


public class B1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/alexandra/IdeaProjects/JC2019-09/src/AlexandraShokhan/lesson8/TaskB1/input.txt";
        String content = new Scanner(new File(path)).useDelimiter("\\Z").next();
        List<String> wordsList = new ArrayList<>(Arrays.asList(content.split("(\\s|\\.|\\,)+")));
        System.out.println(wordsList);

        for (int i = 0; i < wordsList.size(); i++) {
            wordsList.set(i, wordsList.get(i).toLowerCase());
        }

        System.out.println(wordsList);

        LinkedList<Word> words = new LinkedList<>();

        for (int i = 0; i < wordsList.size(); i++) {
            words.add(new Word(wordsList, i));
        }

        for (int i = 0; i < words.size(); i++) {
            words.get(i).printWord();
        }
    }
}

class Word {
    String word;
    int frequency;

    public Word(List<String> list, int index) {
        this.word = list.get(index);
        this.frequency = calculateFrequency(list, index);
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

    public void printWord() {
        System.out.println("The word " + word + " repeats " + frequency + " time(s)");
    }
}