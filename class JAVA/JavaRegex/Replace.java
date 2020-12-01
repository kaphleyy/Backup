package JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\bfavor\\b");
        Matcher m = p.matcher("Dom me a favor.Find my favorite favor.....");
        String s = m.replaceAll("good");
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        m.reset();

        while (m.find()) {
            m.appendReplacement(sb, "favor");
        }
        m.appendTail(sb); // appends remaining characters after the last match.
        System.out.println(sb);

    }

}
