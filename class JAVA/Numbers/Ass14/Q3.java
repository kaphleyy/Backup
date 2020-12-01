package Ass14;

public class Q3 {
    public static void main(String[] args) {
        String s = "34/56";
        String[] arr = s.split("/");

        int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        System.out.println(sum);
    }
    
}
