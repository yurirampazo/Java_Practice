package date.classcalendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2021-12-20T12:40:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); // Mês na classe calendar começa com o valor 0. Janeiro = 0
        

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
