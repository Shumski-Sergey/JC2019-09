package vtafeliuk.Lesson9;
//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.
import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        List<Integer> marks = ArrayListCreator.getRandomList(Integer.MAX_VALUE);
        System.out.println(new HashSet<>(marks));
    }
}