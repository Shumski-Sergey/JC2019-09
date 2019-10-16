package tereshko.Lesson6.Test2;

import java.util.Scanner;

public class ATM {
    private Scanner scanner = new Scanner(System.in);
    private Integer twentydollars;
    private Integer fiftydollars;
    private Integer onehundreddollars;
    private Integer volumeATM;

    public ATM(int twenty, int fifty, int hundred) {
        this.twentydollars = twenty;
        this.fiftydollars = fifty;
        this.onehundreddollars = hundred;
        this.volumeATM = this.fiftydollars * 50 + this.onehundreddollars * 100 + this.twentydollars * 20;
    }

    public ATM(int balance) {
        this.volumeATM = balance;
        this.onehundreddollars = percentage(50, this.volumeATM) % 100;
        this.fiftydollars = percentage(30, percentage(30, this.volumeATM)) % 50;
        this.twentydollars = percentage(30, percentage(20, this.volumeATM)) % 50;
    }
    public void getInfoCahs(){
        System.out.println(this.twentydollars+" "+this.fiftydollars+" "+this.onehundreddollars);
    }

    public void setVolumeATM(int cash) {
        this.volumeATM += cash;
    }

    public Integer getVolumeATM() {
        return volumeATM;
    }

    public void withdraw() {
        System.out.println("How much do you want to withdraw?");
        int summ = scanner.nextInt();
        while (summ > this.volumeATM) {
            System.out.println("Amount exceeds ATM balance.Re-enter amount");
            summ = scanner.nextInt();
        }
        System.out.println("What bills do u want?\n1-100$\n2-50$\n3-20$");
        int choice = scanner.nextInt();
        switch (choice) {
            case (1):
                this.volumeATM -= summ;
                summ = summ / 100;
                System.out.println("You are gat " + summ + " hundred bills");
                break;
            case (2):
                this.volumeATM -= summ;
                summ = summ / 50;
                System.out.println("You are gat " + summ + " bills");
                break;
            case (3):
                this.volumeATM -= summ;
                summ = summ / 20;
                System.out.println("You are gat " + summ+ "bills");
        }
    }
    private int percentage(int percent, int total) {
        int score = total * percent / 100;
        return score;
    }

}
