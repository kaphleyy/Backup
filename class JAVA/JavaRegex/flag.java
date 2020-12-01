package JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class flag {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("hello hi , Hello there");

        while (m.find()) {
            System.out.println("found at " + m.start() + " to " + m.end());
        }
        // ! COMMENTS : exclude whitespace and comments in the regex
        Pattern p2 = Pattern.compile("hello     # finds hello everywhere", Pattern.COMMENTS | Pattern.CASE_INSENSITIVE);
        Matcher m2 = p2.matcher("hello hi , Hello there");

        while (m2.find()) {
            System.out.println("found at " + m2.start() + " to " + m2.end());
        }
        // ! DOTALL : allows to match any character including new line
        Pattern p3 = Pattern.compile("hello.world", Pattern.DOTALL);
        Matcher m3 = p3.matcher("hello\nworld of course");

        while (m3.find()) {
            System.out.println("found at " + m3.start() + " to " + m3.end() + " " + m3.group());
        }

        // ! MULTILINE : matching in multiline mode
        Pattern p4 = Pattern.compile("students", Pattern.MULTILINE);
        Matcher m4 = p4.matcher("hello students , Hello\nstudents");

        while (m4.find()) {
            System.out.println("found at " + m4.start() + " to " + m4.end() + " " + m4.group());
        }
        //!UNIX_LINES makes only \n a valid new line sequence for MULTILINE mode , used with MULTILINE everytime

    }
}

