package Ass14;


public class Q4 {
    public static void main(String[] args) {
        String s = "23/43/2001";
        int currYear = 2020;

    String[] arr= s.split("/");
        int year = Integer.parseInt(arr[arr.length-1]);
        System.out.println(currYear-year);
    }
    
}
