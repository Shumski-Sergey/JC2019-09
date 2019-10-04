package AlexandraShokhan.lesson3;

// 2. Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.

public class Task2 {
    public static void main(String[] args) {
        int number = 6;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Number " + number + " is prime.");
        } else {
            System.out.println("Number " + number + " is compound.");
        }
        }
    }
