package yKuzMinskij.Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Напишите два цикла выполняющих многократное сложение строк, один
 * с помощью оператора сложения и String, а другой с помощью StringBuilder
 * и метода append. Сравните скорость их выполнения.
 */

public class TaskB1 {
    public static void main (String[] args) throws IOException {
        inputText();
    }

    private static void inputText() throws IOException {
        System.out.println("\"Speed test\"\nДля начала теста введите любую строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String testText = reader.readLine();
        testString1(testText);
        testString2(testText);
        testString3(testText);
    }
    private static void comparison (String testName, BigDecimal startTime, BigDecimal finishTime) {
        System.out.println(testName + "\nStart time : " + startTime + " ns\nFinish time : " + finishTime +
                " ns\n----------------------------------");
    }

    private static void testString1 (String testText) {
        String testName = "Speed test #1";
        BigDecimal startTime = new BigDecimal(System.nanoTime());
        for (int i = 0; i < 10; i++) {
            testText += testText;
            //System.out.println(testText + i + "\n");      //Тестовый вывод
            }
        BigDecimal finishTime =new BigDecimal(System.nanoTime()).subtract(startTime);
        comparison(testName, startTime, finishTime);
    }

    private static void testString2 (String testText) {
        String testName = "Speed test #2\nconcat using";
        BigDecimal startTime = new BigDecimal(System.nanoTime());
        for (int i = 0; i < 10; i++) {
            testText = testText.concat(testText);
           // System.out.println(testText + i + "\n");      //Тестовый вывод
        }
        BigDecimal finishTime =new BigDecimal(System.nanoTime()).subtract(startTime);
        comparison(testName, startTime, finishTime);
    }

    private static void testString3 (String testText) {
        String testName = "Speed test #3\nStringBuilder using";
        BigDecimal startTime = new BigDecimal(System.nanoTime());
        StringBuilder sb = new StringBuilder(testText);
        for (int i = 0; i < 10; i++) {
            sb.append(sb);
            //System.out.println(sb.toString() + i + "\n");     //Тестовый вывод
        }
        BigDecimal finishTime =new BigDecimal(System.nanoTime()).subtract(startTime);
        comparison(testName, startTime, finishTime);
    }
}

