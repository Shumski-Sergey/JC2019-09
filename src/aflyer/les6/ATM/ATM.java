package aflyer.les6.ATM;

import java.util.Scanner;

public class ATM {
    private int twnty;
    private int ffty;
    private int hndrt;
    public static final int HUNDRET=100;
    public static final int FIFTY=50;
    public static final int TWENTY=20;

    public ATM(){
        this.twnty=0;
        this.ffty=0;
        this.hndrt=0;
    }

    public ATM(int tws, int ffs, int hns){
        this.twnty=tws;
        this.ffty=ffs;
        this.hndrt=hns;
    }

    public int getTwnty() {
        return twnty;
    }

    public int getFfty() {
        return ffty;
    }

    public int getHndrt() { return hndrt;
    }

    public void setTwnty(int twnty) {this.twnty = twnty;}
    public void setFfty(int ffty) {
        this.ffty = ffty;
    }
    public void setHndrt(int hndrt) {
        this.hndrt = hndrt;
    }

    public String getAllCashName(){
        String s="Купюр по "+ HUNDRET +"$: "+ hndrt +" Купюр по "+ FIFTY +"$:"+ ffty+" Купюр по "+ TWENTY +"$:"+ twnty;
        return s;
    }

    public long getAllCash(){
        long sum=hndrt*HUNDRET+ffty*FIFTY+twnty*TWENTY;
        return sum;
    }

    public void AddinMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Введите сумму, которую хотите внести в банкомат:");
        System.out.println("Введите колическтво купюр по "+ HUNDRET + "$");
        int h= Integer.parseInt(sc.next());
        setHndrt(h);
        System.out.println("Введите колическтво купюр по "+ FIFTY + "$");
        int f= Integer.parseInt(sc.next());
        setFfty(f);
        System.out.println("Введите колическтво купюр по "+ TWENTY + "$");
        int t= Integer.parseInt(sc.next());
        setTwnty(t);
        System.out.println("Сейчас в банкомате: "+ getAllCashName()+ " или " + getAllCash());

    }

    public void GivinMoney() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Введите сумму, которую Вы хотите обналичить:");
        long sum = Long.parseLong(sc.next());
        if (sum>getAllCash()) System.out.println("Сумма превышает количесство купюр");
        else if ((sum<TWENTY) || (sum-TWENTY<TWENTY) || (sum%10>0)) System.out.println("Сумма меньше минимального номинала или минимальный номинал не позволяет выдать выбранную сумму");
                }
}
