package practiceQuestions;

import java.lang.StringBuilder;

public class Q8 {
    public static void main(String[] args) {
        System.out.println(toBlock("we are here for codingerrr"));
    }

    static String toBlock(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String[] arr = s.split(" ");
        for (String p : arr)
            sb.append(p);

        int c = 0;
        int start = 0;
        int i = 0;
        while (i < sb.length()) {
            c++;
            if (c == 5) {
                sb2.append(sb.toString().substring(start, i + 1) + " ");
                start = i + 1;
                c = 0;
            }
            i++;
        }
        sb2.append(sb.toString().substring(start));

        return sb2.toString();
    }

}
