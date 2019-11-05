package nsivko.lab11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public String input() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = read.readLine();
        } catch (IOException e) {
            System.out.println("yes");
        }
        finally {
            return "I'm working!!!";
        }
    }

    public static void main(String[] args) throws IOException {
        Task3 error = new Task3();
        String s = null;
        s = error.input();
        System.exit(0);
        System.out.println(s);
    }
}
