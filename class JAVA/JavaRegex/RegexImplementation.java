package JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexImplementation {
    public static void main(String[] args) {
        String regex = "A.B";
        String sentence = "All of AgB and AxBs are detected.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            System.out.println(matcher.start() + "===>" + matcher.end());
        }
        System.out.println(pattern.pattern());

        // method 2
        // matches() matches for the entire string not a substring in a string , below
        // line will give false
        // boolean b2 = Pattern.compile("Hello").matcher("Hello World").matches();
        // System.out.println(b2);

        // method 3
        // boolean b3 = Pattern.matches(regex, sentence);
    }
}
