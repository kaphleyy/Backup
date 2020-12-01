package Ass7;

public class split {

    public static void main(String[] args) {
        String s = "Hello, all | welcome here, good | luck";
        String[] arr = s.split("[,|]", 10);
        for(String elem : arr) System.out.println(elem);
    }
    
}
