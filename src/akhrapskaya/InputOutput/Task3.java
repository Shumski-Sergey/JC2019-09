package akhrapskaya.InputOutput;

import java.io.*;

public class Task3 {
    private static final String QUIT = "!q";
    private static final File FILE = new File("src/akhrapskaya/InputOutput/lnes.txt");

    public static void  main(String[] args) {
        System.out.println("Введите текст. Для завершения введите: !q");
        fromConsoleToFile();
    }

    private static void fromConsoleToFile() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;
        String s;
        while (true){
            try {
                writer = new FileWriter(FILE, true);
                s = br.readLine();
                if (s.equals(QUIT)) break;
                writeInFile(writer, s);
            }
                catch (IOException e){
                e.printStackTrace();
            }
            finally {
                try {
                    assert writer != null;
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void writeInFile(FileWriter writer, String s) throws IOException {
        writer.write(s);
        writer.append('\n');
        writer.flush();
    }
}
