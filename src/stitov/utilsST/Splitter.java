package stitov.utilsST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Splitter {
    /**
     * Split line on words
     * @param str line, that need to split
     * @return ArrayList of words
     */
    public static ArrayList<String> splitWords(String str){
        Pattern pattern = Pattern.compile("\\W");
        return new ArrayList<>(Arrays.asList(pattern.split(str)));
    }

    /**
     * Split line on numbers
     * @param str line to split
     * @return ArrayList of numbers
     */
    public static ArrayList<String> splitNumbers(String str){
        Pattern pattern = Pattern.compile("\\D");
        return new ArrayList<String>(Arrays.asList(pattern.split(str)));
    }

    /**
     * Split string to Array with day, month and year
     * @param date Date in String format
     * @return 3 elements: days, months, years
     */
    public static String[] getDate(String date){
        Pattern pattern = Pattern.compile("[-_.,/ ]");
        return pattern.split(date);
    }
}
