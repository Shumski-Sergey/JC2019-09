package asenyuk.Lesson4;

    public class Lesson4Task2b {
    public static void main(String[] args) {

        String TEXT ="cаша, иди и учи java!!!";

        int n= TEXT.length();
       // System.out.println(n);

        String zamena = TEXT.replaceAll("[,!.?]", "");
        int m=zamena.length();

        System.out.println((n-m) + " - count of punctuation characters ");

    }

}
