package stitov.Lesson2.Lesson9.TaskB1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

class FreqDictionary {
    private ArrayList<PairForFreqDictionary> wordsAndAmount = new ArrayList<PairForFreqDictionary>();
    private HashSet<String> uniqueWords = new HashSet<String>();
    private ArrayList<String> words = new ArrayList<String>();

    private void setWords(String line) {
        Pattern pattern = Pattern.compile("\\W+");
        String[] strWords = pattern.split(line);
        Collections.addAll(this.words, strWords);
    }

    ArrayList<String> getWords() {
        return this.words;
    }

    private void setUniqueWords() {
        this.uniqueWords.addAll(this.words);
    }

    HashSet<String> getUniqueWords() {
        return this.uniqueWords;
    }

    private void setWordsAndAmount() {
        Iterator<String> iterator = this.uniqueWords.iterator();
        int counter;
        String str;
        while (iterator.hasNext()) {
            counter = 0;
            str = iterator.next();
            for (String i : this.words) {
                if (str.equals(i)) {
                    counter++;
                }
            }
            PairForFreqDictionary pair = new PairForFreqDictionary(str, counter);
            this.wordsAndAmount.add(pair);
        }
    }

    void showFrequencyDictionary(String line) {
        this.setWords(line);
        this.setUniqueWords();
        this.setWordsAndAmount();
        for (PairForFreqDictionary item : this.wordsAndAmount) {
            item.showPair();
        }
    }

}
