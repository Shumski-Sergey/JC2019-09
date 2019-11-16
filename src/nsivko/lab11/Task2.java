package nsivko.lab11;

import java.io.IOException;

public class Task2 {
    public static String input() throws IOException {
        try {
            throw new IOException("№ 1");
        }
        finally {
            throw new IOException("№ 2");
        }
    }

    public static void main(String[] args) throws IOException{
        try {
            input();
        } catch (IOException e) {
            System.out.println(input());
        }
    }
}
