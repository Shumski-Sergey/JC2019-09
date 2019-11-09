package stitov.Lesson10_Map_Set.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class Words {
    static ArrayList<String> getStringArray(String line){
        Pattern pattern = Pattern.compile(" ");
        return new ArrayList<>(Arrays.asList(pattern.split(line)));
    }
    private static HashMap<Character,Integer> getMap(String word){
        HashMap<Character,Integer> map = new HashMap<>();
        for (char l : word.toCharArray()){
            if (map.containsKey(l)){
                map.put(l,map.get(l)+1);
            } else {
                map.put(l,1);
            }
        }
        return map;
    }
    static ArrayList<ArrayList<String>> getGroups( ArrayList<String> arrayOfWords){
        ArrayList<ArrayList<String>> finalArray = new ArrayList<>();
        for (int i = 0; i< arrayOfWords.size(); i++) {
            ArrayList<String> everyLine = new ArrayList<>();
            everyLine.add(arrayOfWords.get(0));
            for (int j = i + 1; j < arrayOfWords.size(); j++)
                if (isEqualMaps(Words.getMap(arrayOfWords.get(i)), Words.getMap((arrayOfWords.get(j))))) {
                    everyLine.add(arrayOfWords.get(j));
                    arrayOfWords.remove(j);
                    j--;
                }
            arrayOfWords.remove(i);
            i--;
            finalArray.add(everyLine);

        }
        return finalArray;
    }
    private static boolean isEqualMaps(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2) {
        if (map1.size() != map2.size()) {
            return false;
        } else {
            for (Map.Entry entry1 : map1.entrySet()) {
                if (!map2.containsKey(entry1.getKey())){
                    return false;
                } else  if (map2.get(entry1.getKey()) != entry1.getValue()) {
                    return false;
                }
            }
        }
        return true;
    }
}
