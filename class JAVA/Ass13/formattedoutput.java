package Ass13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class formattedoutput {
    public static void main(String[] args) {
        String num = "1234567890";
        Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{4})");
        Matcher matcher = pattern.matcher(num);
        while (matcher.find()) {
            System.out.println("(" + matcher.group(1) + ")-" + matcher.group(2) + "-" + matcher.group(3));
        }
    }

}

// To verify whether a given input string is a valid e-mail id match it with the
// following is the regular expression to match an e-mail id −

// "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
// Where,

// ^ matches the starting of the sentence.

// [a-zA-Z0-9+_.-] matches one character from the English alphabet (both cases),
// digits, “+”, “_”, “.” and, “-” before the @ symbol.

// + indicates the repetition of the above-mentioned set of characters one or
// more times.

// @ matches itself.

// [a-zA-Z0-9.-] matches one character from the English alphabet (both cases),
// digits, “.” and “–” after the @ symbol.

// $ indicates the end of the sentence.
