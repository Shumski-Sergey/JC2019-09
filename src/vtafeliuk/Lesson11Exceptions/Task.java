package vtafeliuk.Lesson11Exceptions;

import java.io.FileNotFoundException;

public class Task {
    public static void main(String[] args) {
        try {
            doSmth(null);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        } finally {
            System.out.println("123");
        }
        System.out.println("I'm alive");



    }

    private static void doSmth(Integer number) throws IllegalArgumentException{
        if (number == null){
            throw new IllegalArgumentException("Число не может быть равно null");
        }
    }

}
