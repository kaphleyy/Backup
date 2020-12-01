import java.text.SimpleDateFormat;
import java.util.Locale;

public class Locales {
    public static void main(String[] args) {
        Locale[] ar = SimpleDateFormat.getAvailableLocales();

        for(Locale l : ar) {
            if(l.getDisplayCountry() == "Nepal")
            System.out.println(l.getDisplayCountry() + "  " + l.toString());
        }
    }
    
}
