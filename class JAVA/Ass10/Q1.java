package Ass10;

import java.util.StringTokenizer;

/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        String s = "THIS IS |A TEST, string for, string |tokenizer, class ";

        StringTokenizer token = new StringTokenizer(s , "|,");

        while(token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
}