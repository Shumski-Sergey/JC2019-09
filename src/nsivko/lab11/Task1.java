package nsivko.lab11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
        public String input() throws IOException{
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String s = null;
            try {
                s = read.readLine();
            } catch (IOException e) {
                return "1";
            }
            finally {
                return "2";
            }
        }

    public static void main(String[] args) throws IOException {
        Task1 error = new Task1();
        String s = null;
        s = error.input();
        System.out.println(s);
    }
}
