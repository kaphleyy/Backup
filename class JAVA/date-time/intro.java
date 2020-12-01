
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 * ref
 */
public class intro {

    public static void main(String[] args) throws InterruptedException, IOException {
        //use the function now() to instantiate the classes
        //LocalDate
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
       DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:SS"); 
         
        System.out.println(d.getChronology());
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfYear());
        System.out.println(d.getEra());
        System.out.println(d.isLeapYear());
                System.out.println(d.lengthOfYear());

 
        System.out.println(d);
      
            System.out.println(f.format(dt));
        System.out.println(d.plusDays(20));
         System.out.println(d.minusDays(1));   
              System.out.println();
  System.out.println(t);
  System.out.println(t.minusMinutes(60));
  System.out.println(t.plusMinutes(60));
  System.out.println(LocalTime.parse("10:15"))
  ;
  Date endOfTime = new Date(Long.MAX_VALUE);
System.out.println("Java8 time overflows on " + endOfTime);
  for(int i =0 ; i<100 ; i++){
        Thread.sleep(2000);
 System.out.println(LocalTime.now());
  }
}
}