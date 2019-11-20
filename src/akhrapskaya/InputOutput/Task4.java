package akhrapskaya.InputOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task4 {
    private static final File FILER = new File("/home/lapulik/Рабочий стол/text.doc");
    private static final File FILEW = new File("/home/lapulik/Рабочий стол/text2.txt");

    public static void  main(String[] args) {
        try {
            Reader reader = new InputStreamReader(new FileInputStream(FILER), StandardCharsets.US_ASCII);

            Writer writer = new OutputStreamWriter(new FileOutputStream(FILEW), StandardCharsets.UTF_8);
            int c;
            while ((c = reader.read()) >= 0)
                writer.write(c);
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
