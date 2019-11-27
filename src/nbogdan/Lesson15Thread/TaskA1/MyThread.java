package nbogdan.Lesson15Thread.TaskA1;

import java.util.Random;

public class MyThread extends Thread {
    static final int SLEEP = 2000, ERROR = 777;
    private static final int LIBRARYSIZE = 3;
    static private Random r = new Random();
    public void run() throws NullPointerException {
        System.out.println(Thread.currentThread().getName() + " тред запущен");
        try {
            int id = r.nextInt(LIBRARYSIZE);
            while (Library.getBook(id) == ERROR) {
                Library.goToQueue();
            }
            System.out.println(getName() + " тред читает");
            sleep(SLEEP);
            Library.returnBook(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
