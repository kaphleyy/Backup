package practiceQuestions;

import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Mr.Ram Bahadur Pun", ". ");
        StringBuilder sb = new StringBuilder();
        st.nextToken();
        while (st.hasMoreTokens())
            sb.append(st.nextToken() + " ");

        System.out.println(sb);
    }

}
