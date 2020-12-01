package Ass7;

public class Q4 {
    public static void main(String[] args) {
        String s = "ThisShouldBeReversed";
        String rev ="";
        for (int i = s.length()-1 ; i>=0 ; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
    
}
