package asenyuk;

public class Lesson3Task3a {
    public static void main(String[] args) {
        int i= 23456789;

        String str = Integer.toString(i);

        str = str.replaceAll("(.{3})", "$1 ");


        System.out.println(str);

    }
}
