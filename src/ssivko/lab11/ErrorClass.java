package ssivko.lab11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ErrorClass {
    public String input() throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String t = null;
        try {
            t = buf.readLine();
            System.exit(0);
        }
        catch (IOException e){


        }
        finally {
            return "Я все таки выполнился ";
        }
    }

    public static void main(String[] args) throws IOException {
        ErrorClass rr = new ErrorClass();
        String t = null;
        t = rr.input();
        System.out.println(t);
    }

}
