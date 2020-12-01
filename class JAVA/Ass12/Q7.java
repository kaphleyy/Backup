package Ass12;

import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) {
        String s = "Move All CApital LETTers To The Last";
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                sb2.append(s.charAt(i));
            }
        }
        StringTokenizer st = new StringTokenizer(sb1.toString(), sb2.toString());
        sb1.setLength(0);
        while (st.hasMoreTokens()) {
            sb1.append(st.nextToken());
        }
        sb1.append(sb2.toString());
        System.out.println(sb1);




        // StringBuilder sb= new StringBuilder("Move ALl CApital Letters To The Last");

        // int i = 0;
        // while (i < a.length()) {
        // if ( sb.charAt(i) < 91 && sb.charAt(i) > 64) {
        // sb.append(sb.charAt(i));
        // sb.deleteCharAt(i);
        // }
        // else
        // i++;
        // }
        // System.out.println(sb);
    }

}
