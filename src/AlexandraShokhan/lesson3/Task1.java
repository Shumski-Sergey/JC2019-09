package AlexandraShokhan.lesson3;

public class Task1 {
    public static void main(String[] args) {
      int number = 123865;
      int sum = 0;
      while (number > 0) {
          sum += number % 10;
          number = number / 10;
      }
System.out.println("Sum of the digits of the number equals to " + sum);
        }
    }