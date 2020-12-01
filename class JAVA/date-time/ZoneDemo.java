import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneDemo {
    public static void main(String[] args) {
        ZoneId id = ZoneId.systemDefault();
        System.out.println(id);
        System.out.println(id.getId());
        System.out.println(id.getDisplayName(TextStyle.FULL_STANDALONE,Locale.CHINA));
        

        ZoneId z1 = ZoneId.of("Greenwich");
        System.out.println(z1);

        long totalZoneIdCount = ZoneId.getAvailableZoneIds().stream().count();
        System.out.println("Total ZoneID are : " + totalZoneIdCount);

        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        ZoneId kat = ZoneId.of("Asia/Katmandu");
        System.out.println(kat);
        
    }
    
}
