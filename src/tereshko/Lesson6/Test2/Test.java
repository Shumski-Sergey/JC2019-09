package tereshko.Lesson6.Test2;

public class Test {
    public static void main(String[] args) {
        ATM atm=new ATM(4300);
        System.out.println(atm.getVolumeATM());
        atm.getInfoCahs();
        atm.withdraw();
    }
}
