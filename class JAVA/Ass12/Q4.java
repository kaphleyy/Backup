package Ass12;

public class Q4 {
    public static void main(String[] args) {

        String s = "This is it";
        String[] token = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < token.length; i++) {
            StringBuilder tempSb = new StringBuilder(token[i]);
            if (i == token.length - 1)
                sb.append(tempSb.reverse());
            else
                sb.append(tempSb.reverse() + " ");
        }

        System.out.println(sb);
    }

}
