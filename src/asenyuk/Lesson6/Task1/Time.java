package asenyuk.Lesson6.Task1;

public class Time {

    private int minutes;
    private  int hour;
    private  int seconds;
     final private int n=60;

    Time (int hour,int minutes,int seconds) {
        this.hour=hour;
        this.minutes=minutes;
        this.seconds=seconds;
    }

     Time (int seconds) {
         this.seconds=seconds;
     }

      int getTimeSeconds () {
 return  hour*n*n +minutes*n+seconds;
              }

  void showTimeSeconds () {
        System.out.println("Time is " +getTimeSeconds ());
  }

 int CompareTime (Time t) {
        int i=0;
                if (this.getTimeSeconds() >t.getTimeSeconds())
                                     i=1;
     else if (this.getTimeSeconds() <t.getTimeSeconds())
     i=-1;
return i;

  }

}
