package ssivko.lab6.Time;

public class NewTime {
    private int hours;
    private int minutes;
    private int seconds;

    public void setHours(int userhours){
     hours = userhours;
    }
    public int getHours(){
        return hours;
    }
    public void setMinutes(int userMinutes){
        hours = userMinutes;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setSeconds(int userSeconds){
        hours = userSeconds;
    }
    public int getSeconds(){
        return seconds;
    }

    public NewTime(int h, int m, int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;

    }
    Integer allsecond(){
        int resalt;
         resalt = hours * 3600 + minutes * 60 +seconds;
         return resalt;
    }


    int compareTo(NewTime time2) {
        return (this.allsecond() < time2.allsecond()) ? -1 :
                ((this.allsecond().equals(time2.allsecond())) ? 0 : 1);
    }
    void text(int r){
        if (r == 1) {
            System.out.print("\nПервый промежуток времени больше второго");
        } else if (r == 0) {
            System.out.print("\nПервый промежуток времени равен второму");
        } else System.out.print("\nПервый промежуток времени меньше второго");
    }



}
