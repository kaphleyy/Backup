package RandomNumbers;

/**
 * Q5
 */
public class Q5 {

    public static void main(String[] args) {
        int n = 72;
        int sum = n + rev(n);
        System.out.println((sum==rev(sum)? "Palindromic Number" :"Non-palindromic Number"));

    }
    public static int rev(int n) {
    String rev = "";
    while(n!=0){
         int rem= n % 10;
         rev+=rem;
         n = n/10;
    } 
    return Integer.parseInt(rev);
    
    }
}