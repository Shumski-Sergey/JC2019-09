package nbogdan.Lesson15Thread.TaskA1;

import java.util.Arrays;
import java.util.List;

import static nbogdan.Lesson15Thread.TaskA1.MyThread.ERROR;
import static nbogdan.Lesson15Thread.TaskA1.MyThread.SLEEP;

class Library {
    private static List<Book> books = Arrays.asList(new Book("Чак паланик, Бойцовский клуб", 0), new Book("Стивен кинг, Сияние", 1), new Book("Стивен кинг, Оно", 2));
    synchronized static int getBook(int id) throws InterruptedException {
        for(Book book : books) {
            if (book.getId() == id) {
                if (book.isAvailability()) {
                    System.out.println("Бабуля пошла за книжкой");
                    Thread.sleep(SLEEP);
                    book.setAvailability(false);
                    System.out.println(Thread.currentThread().getName() + " тред забрал книгу " + book.getName());
                    return id;
                }
            }
        }
        return ERROR;
    }
    synchronized static void returnBook(int id) throws InterruptedException {
        for(Book book : books) {
            if (book.getId() == id) {
                    Thread.sleep(SLEEP);
                    book.setAvailability(true);
                    System.out.println(Thread.currentThread().getName() + " тред вернул книгу " + book.getName());
            }
        }
    }
    static void goToQueue() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " тред ждет в очереди за книгой");
        Thread.sleep(SLEEP);
    }
}