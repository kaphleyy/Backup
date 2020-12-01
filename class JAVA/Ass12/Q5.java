package Ass12;

public class Q5 {
    public static void main(String[] args) {
        String s = "capitalize the last letter of a sentence";
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");

        for (String p : arr) {
            String temp = p.substring(0, p.length() - 1) + (char) (p.charAt(p.length() - 1) - 32);
            sb.append(temp + " ");
        }
        System.out.println(sb);
    }

}
