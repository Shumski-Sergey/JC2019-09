package asenyuk.Lesson12_Date_Time_API;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E");
         simpleDateformat = new SimpleDateFormat("EEEE");
        System.out.println(simpleDateformat.format(date));
    }
}
