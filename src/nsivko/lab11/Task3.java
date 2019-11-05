package nsivko.lab11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public String input() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = read.readLine();
        } catch (Exception e) {

        }
        finally {
            System.exit(0);
            return "I'm working!!!";
        }
    }

    public static void main(String[] args) throws Exception {
        Task3 error = new Task3();
        String s = null;
        s = error.input();
        System.out.println(s);
        System.out.println("no finally");
    }
}
