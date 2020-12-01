package Ass11;

public class Q3 {

    public static void main(String[] args) {

        String s = "the\ttabs\tshould\tbe\treplaced\twith\tspaces";
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("\t");

        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1)
                sb.append(str[i]);
            else
                sb.append(str[i] + " ");
        }
        System.out.println(sb);
    }

}
