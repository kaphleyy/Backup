package Ass10;

import java.util.StringTokenizer;

public class Q4 {

    public static void main(String[] args) {

        String s = "this is, a sentence, for counting, number of, words and, delimiters too";
        StringTokenizer token = new StringTokenizer(s);
        StringTokenizer token2 = new StringTokenizer(s, ",");

        System.out.println("The number of words are : " + token.countTokens());
        System.out.println("The number of Delimeter are : " + (token2.countTokens() - 1));

    }

}
