package akhrapskaya.InputOutput;

import akhrapskaya.Utils.MyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;


public class Task1 {
    public static void  main(String[] args) {
        File file = MyFiles.getFileName("Введите имя файла");
        HashMap<Integer, Integer> map = readFileToMap(file);
        printMax(map);
    }

    private static HashMap<Integer, Integer> readFileToMap(File file) {
        HashMap<Integer, Integer> map = new HashMap<>();
        try (FileInputStream reader = new FileInputStream(file)){
            map = getMap(reader);
        }
        catch (FileNotFoundException ex){
            System.out.println("Файл не найден!");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return map;
    }

    private static void printMax(HashMap<Integer, Integer> map) {
        Integer maxV = Collections.max(map.values());
        map.entrySet().stream()
                .filter(x -> x.getValue().equals(maxV))
                .forEach(x -> System.out.print(x.getValue() +" "));
    }

    private static HashMap<Integer, Integer> getMap(FileInputStream reader) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        while ((i = reader.read()) != -1) {
             if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
             else
                 map.put(i, 1);
        }
       return map;
    }
}
