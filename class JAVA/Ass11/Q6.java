package Ass11;

public class Q6 {
    public static void main(String[] args) {

        String s = "we should put something";
 
        StringBuilder sb = new StringBuilder(s);
        sb.insert(14, "\\");
        System.out.println(sb);

    }
}
