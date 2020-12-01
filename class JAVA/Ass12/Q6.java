package Ass12;

public class Q6 {
    public static void main(String[] args) {
        String a = "first";
        int n1 = a.length();
        String b = "second";
        a = a + b;
        b = a.substring(0, n1);
        a = a.substring(n1);
        System.out.println(a + " " + b);

    }

}
