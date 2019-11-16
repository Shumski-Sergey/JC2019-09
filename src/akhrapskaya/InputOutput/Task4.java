package akhrapskaya.InputOutput;

import java.io.*;

public class Task4 {
    private static final File FILER = new File("/home/lapulik/Рабочий стол/text.doc");
    private static final File FILEW = new File("/home/lapulik/Рабочий стол/text2.txt");

    public static void  main(String[] args) {
        try {
            Reader reader = new InputStreamReader(new FileInputStream(FILER), "Cp1251");

            Writer writer = new OutputStreamWriter(new FileOutputStream(FILEW), "UTF-8");
            int c = 0;
            while ((c = reader.read()) >= 0)
                writer.write(c);
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
