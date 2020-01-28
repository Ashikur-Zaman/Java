
package javaarrray;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        
        Date date = new Date();
        DateFormat dateformat = new SimpleDateFormat("dd/mm//yy");
        String dt = dateformat.format(date);

        System.out.println("Date : "+dt);
        
        LocalTime time = LocalTime.now();
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("hh:mm:ss");
        String Currenttime = timeformat.format(time);
        System.out.println("Time : "+Currenttime);
        
        
        
    }
}
