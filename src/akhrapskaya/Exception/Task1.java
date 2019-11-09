package akhrapskaya.Exception;

public class Task1 {
    private String error() {
        int k = 0, d = 10, s;
        try {
            s = d/k;
            return "OK";
        }
        catch (ArithmeticException e){
            return "I'm from catch";
        }
        finally {
            return  "I'm from Finally";
        }
    }
    public static void  main(String[] args) {
        Task1 example = new Task1();
        System.out.println(example.error());
    }
}
