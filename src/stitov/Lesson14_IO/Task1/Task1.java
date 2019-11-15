package stitov.Lesson14_IO.Task1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    // src\stitov\Lesson14_IO\Task1\input.txt
    public static void main (String[] args){
        System.out.println("Input the path: ");
        String path = inputPath();
        try {
           System.out.println(getMax(path));
        }catch (Exception e){
            System.out.println("The file haven't been found");
        }

    }
    private static String inputPath(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static String getMax(String path) throws IOException {
        FileInputStream file = new FileInputStream(path);
        try {
            byte[] bytes = new byte[254];
            int i = -1;
            HashMap<Byte, Integer> map = new HashMap<>();
            while ((i=file.read(bytes))!=-1){
                addToMap(i, map);
            }
            file.close();
            return getBytes(map, getMaxValue(map));
        }catch (Exception e){
            file.close();
            System.out.println(e.getMessage());
        }
        return "";
    }
    private static void addToMap(int bytes, HashMap<Byte, Integer> map){
        if (map.containsKey(bytes)){
            map.put((byte) bytes,map.get(bytes)+1);
        } else {
            map.put((byte) bytes,1);
        }
    }
    private static Integer getMaxValue(HashMap<Byte,Integer> map){
      ArrayList<Integer> arrayList = map.values().stream().sorted(Comparator.reverseOrder()).collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
      return arrayList.get(0);
    }
    private static String getBytes (HashMap<Byte,Integer> map, int maxValue){
       return map.entrySet().stream().filter(s->s.getValue().equals(maxValue)).map(s->s.getKey().toString()).collect(Collectors.joining(" "));
    }
}
