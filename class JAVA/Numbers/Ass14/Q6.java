package Ass14;

public class Q6 {
    public static void main(String[] args) {
        String s = "abc 123 xxxxxx pr  f hk 43 hkl 3 fhdk 4 r 4334";
        for(String p : s.split("A-Za-z")){
            System.out.println(p);
        }
    }
    
}
