package Ass11;

public class Q4 {
    public static void main(String[] args) {
        String  s = "we should put something";

        StringBuilder sb = new StringBuilder(s);
        sb.insert(14, "\\t");
        System.out.println(sb);
    }

}