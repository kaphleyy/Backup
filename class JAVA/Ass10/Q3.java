package Ass10;

import java.util.StringTokenizer;


public class Q3 {
    public static void main(String[] args) {
        String s = "This sentence is here to count the number of words";
        StringTokenizer token = new StringTokenizer(s);

        System.out.println(token.countTokens());
    }
}
