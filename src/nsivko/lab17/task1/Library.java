package nsivko.lab17.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Library {

    static HashMap<Integer, String> createBooks() {
        String[] booksName = {"До встречи с тобой", "Код Да Винчи", "Расскажи мне о море", "После", "Ты умеешь хранить секреты?", "Таинственная история Билли Миллигана", "Письма с острова Скай", "Мне тебя обещали", "Ведьмак", "Гарри Поттер"};
        HashMap<Integer, String> books = new HashMap<>();
        for (int i = 0; i < booksName.length; i++) {
            books.put(i+1, booksName[i]);
        }
        return books;
    }

    private synchronized static ArrayList<String> bookForPeople() {
        HashMap<Integer, String> books = createBooks();
        ArrayList<String> listBookPeople = new ArrayList<>();
        System.out.print("\n\nСколько книг хотите взять? Введите число от 1 до " + books.size() + " ");
        Scanner scan = new Scanner(System.in);
        int n = books.size();
        int numberBook = scan.nextInt();
        while (listBookPeople.size() != numberBook) {
            int keyBook = (int) ((Math.random() * n) + 1);
            if (books.get(keyBook) != null) {
                listBookPeople.add(books.get(keyBook));
                books.remove(keyBook);
            }
        }
        return listBookPeople;
    }

    private synchronized static void setBooks(ArrayList<String> list, HashMap<Integer, String> book) {
        Integer[] key = new Integer[book.size()];
        book.keySet().toArray(key);
        for (String s1 : list) {
            int a = (int) ((Math.random() * 2) + 1);
            String s;
            if (a == 1) {
                s = " можно взять на руки.";
            } else {
                s = " можно взять почитать в зале.";
            }
            boolean prov = true;
            for (Integer integer : key) {

                if (s1.equals(book.get(integer))) {
                    prov = false;
                    System.out.print("\nКнига " + "\"" + book.get(integer) + "\"" + " есть в библиотеке и её " + s);
                    book.remove(integer);
                    break;
                }
            }
            if (prov) {
                System.out.print("\nКнигу " + "\"" + s1 + "\"" + " уже забрали. Придётся подождать.");
            }
        }
    }

    static void getIntegerStringHashMap(HashMap<Integer, String> books, int i) {
        Thread people = new Thread(new MyRunnable());
        people.setName(i + ".");
        people.start();
        ArrayList<String> list = bookForPeople();
        System.out.print(people.getName() + " Посетитель хочет взять книги: ");
        for (String b : list) {
            System.out.print("\n- " + b);}
        setBooks(list, books);
    }
}
