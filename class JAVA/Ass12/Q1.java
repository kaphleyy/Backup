package Ass12;

public class Q1 {

    public static void main(String[] args) {
        String s = "Remove r from this string";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'r' || sb.charAt(i) == 'R')
                sb.deleteCharAt(i);
        }
        System.out.println(sb);

    }

}
