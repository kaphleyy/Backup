package Ass13;

public class Q5 {
    public static void main(String[] args) {
        String s = "CSE1ECE2EEE";

        String[] arr = s.split("\\d");
        for (String p : arr) {
            System.out.println(p);
        }
    }

}
