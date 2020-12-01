import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatter {
    public static void main(String[] args) 
    {
        String[] arr = {"yy/MM/dd hh:mm:ss","dd.MM.yyyy","dd.MMMM.yy", "HH:mm:ss SSS","hh:mm:ss SSS a", " yy-MMM-DD G",
    "uuuu/M/dd G","yyyy QQQQ","YYYY yyyy/MMMM/dd","w yyyy","W MMMM","EEEE dd","F dd","hh:mm:ss:A:n a",
    "'date-' yyyy/MMM/dd 'time-' hh:mm:ss"
    };

        for(int i=0 ;i<arr.length ; i++ ){

        DateTimeFormatter df =DateTimeFormatter.ofPattern(arr[i]);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.format(df));
    
        } 
    }
    
}
