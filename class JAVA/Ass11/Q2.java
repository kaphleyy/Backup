package Ass11;

public class Q2 {
    public static void main(String[] args) {

        String s = "the spaces should be replaced with tabs";
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1)
                sb.append(str[i]);
            else
                sb.append(str[i] + "\t");
        }
        System.out.println(sb);

    }

}
