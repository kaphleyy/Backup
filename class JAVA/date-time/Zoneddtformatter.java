import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zoneddtformatter {
        public static void main(String[] args) {
            ZonedDateTime dt =LocalDateTime.now().atZone(ZoneId.of("Europe/Athens"));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy/MMMM/dd  hh:MM:ss SSS a O");
            System.out.println(dt.format(formatter));

            ZoneId z = ZoneId.of("Asia/Katmandu");
           DateTimeFormatter fo = DateTimeFormatter.ofPattern("yyy/MMMM/dd hh:mm:ss a zzzz ").withZone(z);
           LocalDateTime date= LocalDateTime.now();
            System.out.println(fo.format(date)); 

            ZonedDateTime dt2 = ZonedDateTime.now();
             System.out.println(dt2.format(formatter));


        }
}
