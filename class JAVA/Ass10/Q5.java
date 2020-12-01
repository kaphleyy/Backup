package Ass10;

import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {
        String s = "This ,sentence should |be returned. without. delimeters ";
        StringTokenizer token = new StringTokenizer(s, ",|.");
        String t = "";
        while (token.hasMoreTokens()) {
            t += token.nextToken();
        }
        StringTokenizer token2 = new StringTokenizer(s, t);

        while (token2.hasMoreTokens()) {
            System.out.println(token2.nextToken());
        }

    }
}
