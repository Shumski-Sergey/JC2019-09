package balexej.lesson11;

import tereshko.rrr.Error;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public String input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println("123");
            return "im catch";

        } finally {
            return "Im finally";
        }
    }

    public static void main(String[] args) throws IOException {
        Error er = new Error();
        String s = null;
        s = er.input();
        System.out.println(s);
    }
}
