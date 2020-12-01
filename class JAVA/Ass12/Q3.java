package Ass12;

public class Q3 {

    public static void main(String[] args) {
        String s = "235df343";
        boolean decision = true;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= 48 && s.charAt(i) <= 57))
                decision = false;
        }
        System.out.println(decision);
    }

}
