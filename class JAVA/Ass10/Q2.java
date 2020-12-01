package Ass10;

import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) {
        String s = "THIS IS |A TEST, string for, string |tokenizer, class ";
        
        StringTokenizer token = new StringTokenizer(s,"|," , true);

        while(token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }
    
}
