package nbogdan.Lesson15Thread.TaskA1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество тредов");
        Thread[] readers = new MyThread[sc.nextInt()];
        for(int i = 0; i < readers.length; i++) {
            readers[i] = new MyThread();
            readers[i].setName(Integer.toString(i + 1));
            readers[i].start();
        }
    }
}
