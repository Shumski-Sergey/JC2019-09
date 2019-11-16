package stitov.Lesson11;

public class TryExceptions {
    public static void main(String[] args){
        try{
            System.out.println("Try Exception");
            f();
        } catch (Exception e){
            System.out.println("We catch Exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("There wasn't Exception, but finally work");
        }
        System.out.println("Program is working");
    }
    public static void f()throws Exception{
        try {
            throw new NullPointerException("FirstException");
        } catch (NullPointerException e){
            System.out.println("We catch Exception and try to throw further");
            System.exit(0);
        }
        finally {
            System.out.println("We come to finally");
        }
    }
}
