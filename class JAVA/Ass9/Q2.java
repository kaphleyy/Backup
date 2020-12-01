package Ass9;

public class Q2 {
    public static void main(String[] args) {
        String s = "First letter should be capital";
        s = s.toLowerCase();
        String[] arr = s.split(" ");
    
        for (int i=0 ; i<arr.length; i++) {
            String currString = arr[i];
            arr[i] = (char)(currString.charAt(0) -32)+ currString.substring(1) ;
        }

        for(String elem : arr) {
            System.out.println(elem);
        }
    }

    
}
