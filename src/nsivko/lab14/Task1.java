package nsivko.lab14;

import static nsivko.utils.forStringAndStream.createString;
import static nsivko.utils.forStringAndStream.printMax;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите имя файла: "); // src\nsivko\lab14\task1.txt
        String name = createString();
        try {
            printMax(name);
        } catch (Exception e) {
            System.out.println("Файл не найден!");
        }
    }
}
