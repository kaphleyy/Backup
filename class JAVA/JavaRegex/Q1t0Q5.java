package JavaRegex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1t0Q5 {
    public static void main(String[] args) {

        String regex[] = {"Anji.*|Anjie.*|Anjy.*","^[aeiouAEIOU].*", "[1-9][0-9]{0,5}", "(get).*(set).*(go).*", "^(A-Z.*)^(a-z.*)([_].*)(*.[0-9]$)"};
        Scanner sc = new Scanner(System.in);

        for (int i=0 ; i<regex.length; i++) {
        String sentence = sc.nextLine();
        Pattern pattern = Pattern.compile(regex[i]);
        Matcher matcher = pattern.matcher(sentence);

        while(matcher.find()) {
            System.out.println("Match found in location (" + matcher.start() + "," + matcher.end()+ ")");
        }
    }
    sc.close();
}
    
}
