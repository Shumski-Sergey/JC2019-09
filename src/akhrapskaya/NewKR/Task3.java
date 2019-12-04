package akhrapskaya.NewKR;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3 {
    private static final File FILE_W = new File("src/akhrapskaya/NewKR/file.txt");
    private static final File FILE_R = new File("src/akhrapskaya/NewKR/newfile.txt");
    private static final int COUNT = 10;
    private static final int MAX = 100;

    public static void main(String[] args) {
        String str = getString();
        createFile(str, FILE_W);
        str = read();
        str =sortNumbers(str);
        createFile(str, FILE_R);
    }

    private static String read() {

        String str = "";
        try {
            BufferedReader reader= new BufferedReader(new FileReader(Task3.FILE_W));
            str = reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("Файл для чтения не найден!");
        } catch (IOException e) {
            System.out.println("ОШибка чтения из файла");
        }
        return str;
    }

    private static String sortNumbers(String str) {
        return Arrays.stream(str.split(" "))
                .map(Integer::parseInt)
                .filter(x -> x%2==0)
                .sorted()
                .map(x-> Integer.toString(x))
                .collect(Collectors.joining(" "));
    }

    private static String getString() {
        Random random = new Random();
        String str = "";
        for (int i =0; i < COUNT; i++){
            str = str.concat(random.nextInt(MAX) + " ");
        }
        System.out.println(str);
        return str;
    }

    private static void createFile(String str, File file) {
        try (FileWriter writer = new FileWriter(file)){
            writer.write(str);
        }
        catch (IOException e){
            System.out.println("ОШибка записи в файл");
        }
    }
}
