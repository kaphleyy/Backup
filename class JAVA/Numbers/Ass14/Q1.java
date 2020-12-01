package Ass14;

public class Q1 {
    public static void main(String[] args) {        
        try {

            int n = Integer.parseInt("422.4");
            n = n*2;
            System.out.println("valid");
        }catch (Exception e) {
            System.out.println("Invalid");
        }
    }
    
}
