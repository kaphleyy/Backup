package Ass13;

import java.util.regex.Pattern;

public class Q1 {
    public static void main(String[] args) {

        String s = "This is a       test string";
        String regex = "\s+|\t+";

        Pattern pattern = Pattern.compile(regex);

        String[] arr = pattern.split(s);

        for (String p : arr) {
            System.out.println(p + "/");
        }

    }
}
