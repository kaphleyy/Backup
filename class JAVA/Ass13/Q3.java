package Ass13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3 {
    public static void main(String[] args) {
        String email = "ak@gmail.com";
        String url = "www.gmail6.com/fs4-fd";

        String regex1 = "@\\.";
        String regex2 = "^(https?://)?^(www\\.)?[a-zA-Z0-9].*.[a-zA-Z].*/.*$";

        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);

        Matcher matcher1 = pattern1.matcher(email);
        Matcher matcher2 = pattern2.matcher(url);

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());

    }

}
