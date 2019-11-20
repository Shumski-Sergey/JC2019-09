package dmikulionak.IO;
//3.Организовать построчное считывание данных, введенных с консоли,
// и их запись в файл. Признаком окончания записи (конец работы программы) является строка со словом «#ESC».

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) throws IOException {
        String path = "D:\\testTEXT\\text.txt";
        File text = new File(path);
        boolean newFile = text.createNewFile();
        System.out.println(" новый файл создан ? : " + text.exists());

        Scanner in = new Scanner(new InputStreamReader(System.in));
        String input;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(text)));
        while (true) {
            input = in.nextLine();
            if (input.equals("#ESC")) {
                writer.flush();
                break;
            }
            writer.write(input + System.lineSeparator());
        }
        writer.close();
        in.close();
    }
}

