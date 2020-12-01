package JavaRegex;
import java.util.regex.Pattern;

public class split {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(is)+");
        String s[] = pattern.split("This and isis or is it and we are");
        for (String p : s) {
            System.out.println(p +"/");
        }
        System.out.println(s.length);
    }
    
    
}
