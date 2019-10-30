package AlexandraShokhan.lesson7.TaskB2;

/* Задача по дженерикам +
Написать метод, который возвращает минимальное и максимальное числа в массиве.
*/

import java.util.Arrays;

public class TaskB2 {

        public static void main(String[] args) throws Exception
        {
            int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

            Pair<Integer, Integer> result = getMinimumAndMaximum(data);

            System.out.println("Minimum is " + result.x);
            System.out.println("Maximum is " + result.y);
        }

        public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array)
        {
            if (array == null || array.length == 0)
            {
                return new Pair<Integer, Integer>(null, null);
            }

            //Напишите тут ваше решение
            Arrays.sort(array);
            return new Pair<Integer, Integer>(array[0],array[9]);

        }


        public static class Pair<X, Y>
        {
            public X x;
            public Y y;

            public Pair(X x, Y y)
            {
                this.x = x;
                this.y = y;
            }
        }
    }

