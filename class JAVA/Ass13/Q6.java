package Ass13;

// package Ass13;

public class Q6 {
    public static void main(String[] args) {
        String s = "This is my   place  i  own it";
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : arr) {
            sb.append(p.charAt(0));
        }
        System.out.println(sb);
    }
}
